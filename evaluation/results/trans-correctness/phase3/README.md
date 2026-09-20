# 'CUSTOMER' Microservice
```bash
cd customer-service

# Test 
mvn clean test -e

# Deploy locally
mvn clean spring-boot:run

# Service API
http://localhost:8081

# Access swagger/swagger-ui.html
http://localhost:8081/swagger-ui/index.html

# Access H2 Database
http://localhost:8081/h2-console
```

# 'CARGO' Microservice
```bash
cd cargo-service

# Test 
mvn clean test -e

# Deploy locally
mvn clean spring-boot:run

# Service API
http://localhost:8082

# Access swagger/swagger-ui.html
http://localhost:8082/swagger-ui/index.html

# Access H2 Database
http://localhost:8082/h2-console
```

# 'LOCATION' Microservice
```bash
cd location-service

# Test 
mvn clean test -e

# Deploy locally
mvn clean spring-boot:run

# Service API
http://localhost:8083

# Access swagger/swagger-ui.html
http://localhost:8083/swagger-ui/index.html

# Access H2 Database
http://localhost:8083/h2-console
```

