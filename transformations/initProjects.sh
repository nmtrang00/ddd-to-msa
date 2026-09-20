#!/bin/bash

set -e

XML_FILE=$1
ROOT_FOLDER=$2

if [ ! -f "$XML_FILE" ]; then
    echo "❌ Error: XML model file '$XML_FILE' not found."
    exit 1
fi

echo "🧬 Parsing XMI Service Model: $XML_FILE"
echo "=========================================================="

# 1. Use Python to parse the XML and pull out all microservice names
SERVICES=$(python3 -c "
import xml.etree.ElementTree as ET
tree = ET.parse('$XML_FILE')
root = tree.getroot()
# Find all microservices elements regardless of namespaces
services = [elem.get('name') for elem in root.iter() if elem.tag.endswith('microservices')]
print(' '.join(services))
")

if [ -z "$SERVICES" ]; then
    echo "❌ No microservices discovered in the XML file."
    exit 1
fi

# 2. Iterate through each discovered service and build the boilerplate
for SERVICE in $SERVICES; do
    # Convert name to lowercase to keep folder names standard (e.g., Cargo -> cargo)
    SERVICE_LOWER=$(echo "$SERVICE" | tr '[:upper:]' '[:lower:]')
    
    # Define microservice-specific naming conventions
    PROJECT_NAME="${SERVICE_LOWER}-service"
    PACKAGE_NAME="com.example.${SERVICE_LOWER}"

    echo "🚀 Generating Project: [$PROJECT_NAME]"
    echo "📦 Package Path: $PACKAGE_NAME"

    # Create the folder and jump inside
    mkdir -p "$ROOT_FOLDER/$PROJECT_NAME"
    cd "$ROOT_FOLDER/$PROJECT_NAME"

    # Fetch fresh boilerplate structure from Spring Initializr
    curl -L https://start.spring.io/starter.tgz \
      -d type=maven-project \
      -d dependencies=web,data-jpa,h2,lombok,validation \
      -d bootVersion=4.0.7 \
      -d javaVersion=21 \
      -d groupId=com.example \
      -d artifactId="$PROJECT_NAME" \
      -d name="$PROJECT_NAME" \
      -d packageName="$PACKAGE_NAME" \
      | tar -xzvf -
    
    # Inject SpringDoc and Cucumber dependencies directly with property-managed versions
    sed -i '' 's|</dependencies>|    <dependency>\n        <groupId>org.springdoc</groupId>\n        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>\n        <version>2.5.0</version>\n    </dependency>\n    <dependency>\n        <groupId>io.cucumber</groupId>\n        <artifactId>cucumber-java</artifactId>\n        <version>7.18.0</version>\n        <scope>test</scope>\n    </dependency>\n    <dependency>\n        <groupId>io.cucumber</groupId>\n        <artifactId>cucumber-spring</artifactId>\n        <version>7.18.0</version>\n        <scope>test</scope>\n    </dependency>\n    <dependency>\n        <groupId>io.cucumber</groupId>\n        <artifactId>cucumber-junit-platform-engine</artifactId>\n        <version>7.18.0</version>\n        <scope>test</scope>\n    </dependency>\n    <dependency>\n        <groupId>org.junit.platform</groupId>\n        <artifactId>junit-platform-suite</artifactId>\n        <scope>test</scope>\n    </dependency>\n</dependencies>|' pom.xml
    
    # Create default BDD directory structure
    mkdir -p "src/test/resources/features"
    mkdir -p "src/test/java/${PACKAGE_NAME//.//}/bdd"
    
    echo "⚙️ Testing initial compilation for $PROJECT_NAME..."
    ./mvnw clean compile

    cd ..
    echo "✅ Finished generating $PROJECT_NAME"
    echo "----------------------------------------------------------"
done

echo "🎉 Success! All discovered services have been initialized."