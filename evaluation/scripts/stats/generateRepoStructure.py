import os
from pathlib import Path

def print_repo_structure(
    root_path: str = ".", 
    ignore_dirs: set = None, 
    indent_str: str = "    "
):
    """
    Recursively prints the directory structure of a repository.
    
    :param root_path: Path to the root folder of the repo.
    :param ignore_dirs: Set of folder names to skip (e.g., '.git', '__pycache__').
    :param indent_str: Indentation string per directory level.
    """
    if ignore_dirs is None:
        ignore_dirs = {".git", "__pycache__", ".venv", "node_modules", ".idea", ".vscode"}

    root = Path(root_path).resolve()
    print(f"{root.name}/")

    def _generate_tree(dir_path: Path, prefix: str = ""):
        # Get and sort items: directories first, then files
        try:
            entries = sorted(list(dir_path.iterdir()), key=lambda e: (not e.is_dir(), e.name.lower()))
        except PermissionError:
            print(f"{prefix}└── [Permission Denied]")
            return

        # Filter out ignored directories
        entries = [e for e in entries if e.name not in ignore_dirs]
        count = len(entries)

        for index, entry in enumerate(entries):
            is_last = (index == count - 1)
            connector = "└── " if is_last else "├── "
            
            print(f"{prefix}{connector}{entry.name}" + ("/" if entry.is_dir() else ""))

            if entry.is_dir():
                # Update prefix for children depending on whether this is the last entry
                extension = "    " if is_last else "│   "
                _generate_tree(entry, prefix + extension)

    _generate_tree(root)

# Example Usage:
if __name__ == "__main__":
    print_repo_structure("/Users/trangnguyen/Study/MS-Thesis/msc-thesis/runtime-EclipseApplication/validation/trans-correctness/phase3/output/customer-service/src/main/java/com/example/customer")