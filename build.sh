#
# Copyright (c) 2023. All rights reserved. https://github.com/ax77
#

#export JAVA_HOME=/usr/lib64/jvm/jre-17-openjdk
#export PATH=$JAVA_HOME/bin:$PATH
#source /etc/profile

cd ./applicant-service
mvn clean install -DskipTests
cd ..

cd ./cv-service
mvn clean install -DskipTests
cd ..

cd ./api-gateway
mvn clean install -DskipTests
cd ..

cd ./service-discovery
mvn clean install -DskipTests
cd ..

cd ./frontend-angular
npm run build