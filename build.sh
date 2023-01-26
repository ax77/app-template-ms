cd ./applicant-service
mvn clean install -DskipTests
cd ..

cd ./cv-service
mvn clean install -DskipTests
cd ..

cd ./api-gateway
mvn clean install -DskipTests
cd ..

cd ./eureka-discovery-server
mvn clean install -DskipTests
cd ..

cd ./frontend-angular
npm run build