# Project architecture notes

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
- [ ] Spring Web (REST API)
- [ ] Spring Data JPA
- [x] Spring Data MongoDB
- [ ] Spring Security
- [ ] Spring WebFlux
- [ ] Spring Cloud Netflix Eureka (routing, load balancing)
- [ ] Spring Cloud Gateway (multiple instances of microservices, their network location)
- [ ] Keycloak
- [x] MongoDB
- [x] PostgreSQL 
- [x] Flyway (database-migration tool)
- [ ] Apache Kafka
- [x] Testcontainers
- [ ] Mockito
- [ ] Grafana
- [ ] Prometheus
- [ ] Docker, Docker compose
- [x] Angular UI
---

### Building and running (TODO):
```
cd app-template-ms
docker compose up
http://localhost:80
```