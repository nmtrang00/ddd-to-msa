#!/bin/bash

# Exit immediately if any command fails
set -e

# --- CONFIGURATION ---
BASE_PATH="src/main/java/com/example"
# Default root folder is the current directory unless overridden by -r
ROOT_DIR="."

# --- HELPER FUNCTION: CAPITALIZE FIRST LETTER ---
get_capitalized_name() {
    echo "$1" | awk '{print toupper(substr($0,1,1)) substr($0,2)}'
}

# --- HELPER FUNCTION: CLEAN DIRECTORY CONTENT ---
clean_dir() {
    local target_dir="$1"
    local exclude_file="$2" # Optional filename to preserve
    
    if [ -d "$target_dir" ]; then
        if [ -n "$exclude_file" ]; then
            echo "🧹 Cleaning: $target_dir (Keeping: $exclude_file)"
            # Recursively delete everything EXCEPT the excluded file
            find "$target_dir" -mindepth 1 ! -name "$exclude_file" -delete
        else
            echo "🧹 Cleaning: $target_dir"
            find "$target_dir" -mindepth 1 -delete
        fi
    else
        echo "⚠️  Directory does not exist: $target_dir"
    fi
}

# --- USAGE INSTRUCTIONS ---
usage() {
    echo "Usage: $0 [options]"
    echo "Options:"
    echo "  -r <root_folder>    Specify the root folder of the project"
    echo "  -s <service_name>   Target a specific service (e.g., 'cargo', 'customer')"
    echo "  -l <layer_name>     Target a specific layer (e.g., 'domain', 'controller')"
    echo "  -a                  Clean all services completely (keeps *Application.java)"
    echo ""
    echo "Examples:"
    echo "  $0 -r /path/to/cargo_example -s cargo           # Cleans cargo service in the specified root folder"
    echo "  $0 -r /path/to/cargo_example -l domain          # Cleans ONLY 'domain' across all services in root"
    echo "  $0 -r /path/to/cargo_example -a                 # Wipes all layers in all services in root"
    exit 1
}

# Parse flags
SERVICE=""
LAYER=""
CLEAN_ALL=false

while getopts "r:s:l:ah" opt; do
    case "$opt" in
        r) ROOT_DIR="$OPTARG" ;;
        s) SERVICE="$OPTARG" ;;
        l) LAYER="$OPTARG" ;;
        a) CLEAN_ALL=true ;;
        h) usage ;;
        *) usage ;;
    esac
done

if [ $# -eq 0 ]; then
    usage
fi

# Standardize path (remove trailing slash if any)
ROOT_DIR="${ROOT_DIR%/}"

if [ ! -d "$ROOT_DIR" ]; then
    echo "❌ Error: The specified root directory '$ROOT_DIR' does not exist."
    exit 1
fi

# Locate all *-service directories in the target root folder
SERVICES=($(find "$ROOT_DIR" -maxdepth 1 -type d -name "*-service" | sed "s|${ROOT_DIR}/||"))

if [ ${#SERVICES[@]} -eq 0 ]; then
    echo "❌ Error: No directories ending with '-service' were found in '$ROOT_DIR'."
    exit 1
fi

# --- CLEANING LOGIC ---

# Scenario 1: Clean EVERYTHING across all services (-a)
if [ "$CLEAN_ALL" = true ]; then
    echo "🚨 WARNING: You are about to wipe all implementations in '$ROOT_DIR' (main Application files will be preserved)!"
    read -p "Are you sure you want to proceed? (y/N) " -n 1 -r
    echo ""
    if [[ $REPLY =~ ^[Yy]$ ]]; then
        for s_dir in "${SERVICES[@]}"; do
            s_name=$(echo "$s_dir" | sed 's/-service//')
            target="${ROOT_DIR}/${s_dir}/${BASE_PATH}/${s_name}"
            
            # Generate the class name to keep (e.g. "CargoApplication.java")
            cap_name=$(get_capitalized_name "$s_name")
            app_file="${cap_name}ServiceApplication.java"
            
            clean_dir "$target" "$app_file"
        done
        echo "✅ All services cleared (Application files preserved)."
    else
        echo "❌ Cancelled."
    fi
    exit 0
fi

# Scenario 2: Clean a specific service
if [ -n "$SERVICE" ]; then
    s_dir="${SERVICE}-service"
    
    if [ ! -d "${ROOT_DIR}/${s_dir}" ]; then
        echo "❌ Error: Service directory '${ROOT_DIR}/${s_dir}' does not exist."
        exit 1
    fi
    
    if [ -n "$LAYER" ]; then
        # Cleaning a sub-layer (e.g., /cargo/domain)
        target="${ROOT_DIR}/${s_dir}/${BASE_PATH}/${SERVICE}/${LAYER}"
        clean_dir "$target"
    else
        # Cleaning the main service folder: preserve the Application file
        target="${ROOT_DIR}/${s_dir}/${BASE_PATH}/${SERVICE}"
        cap_name=$(get_capitalized_name "$SERVICE")
        app_file="${cap_name}ServiceApplication.java"
        
        clean_dir "$target" "$app_file"
    fi
    echo "✅ Clean operation completed."
    exit 0
fi

# Scenario 3: Clean a specific layer across ALL services (-l domain)
if [ -n "$LAYER" ] && [ -z "$SERVICE" ]; then
    echo "🧹 Cleaning layer '$LAYER' across all services in '$ROOT_DIR'..."
    for s_dir in "${SERVICES[@]}"; do
        s_name=$(echo "$s_dir" | sed 's/-service//')
        target="${ROOT_DIR}/${s_dir}/${BASE_PATH}/${s_name}/${LAYER}"
        clean_dir "$target"
    done
    echo "✅ Layer '$LAYER' cleaned across all services."
    exit 0
fi