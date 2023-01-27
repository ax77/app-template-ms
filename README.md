# Project architecture notes

## Requirements
- Git
- JDK 17+
- Docker, Docker compose
- Maven

## Introduction
- This project is a part of studying the architecture of microservice-based applications.
- It depends on libraries and technologies, that are widely used nowadays, according to J2EE development.
- Project structure is based on maven modules.
---

### Micro Services:
- CV Service:
    - Store the information about current positions.
- Applicant Service:
    - Contains the information about job-seekers.
- Angular frontend
    - Basic UI (it's not a goal to study frontend, but it's just nice to test the backend logic by using UI).
---

### Technologies used: 
- [x] Spring Boot
- [x] Spring Web (REST API)
- [x] Spring Data JPA
- [x] Spring Data MongoDB
- [ ] Spring Security
- [x] Spring WebFlux
- [x] Spring Cloud Netflix Eureka (routing, load balancing)
- [x] Spring Cloud Gateway (multiple instances of microservices, their network location)
- [ ] Keycloak
- [x] MongoDB
- [x] PostgreSQL 
- [x] Flyway (database-migration tool)
- [ ] Apache Kafka
- [x] Testcontainers
- [ ] Mockito
- [ ] Grafana
- [ ] Prometheus
- [x] Docker, Docker compose
- [x] Angular UI
---

### Building and running (TODO):
```
git clone https://github.com/ax77/app-template-ms
cd app-template-ms
sh build.sh
docker-compose up --build -d
http://localhost:80
```

### Notes:
- You need to wait while all services are registered in eureka-server (30s - 1m).

  You'll see logs like these: \
  Getting all instance registry info from the eureka server \
  The response status is 200 \
  You may check eureka-server: http://localhost:8761/
