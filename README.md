# 🎓 University Student Microservice System

![Architecture](https://img.shields.io/badge/Microservices-Architecture-blue)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.x-brightgreen)  
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blueviolet)  
![OpenFeign](https://img.shields.io/badge/OpenFeign-Client-orange)  
![WebClient](https://img.shields.io/badge/WebClient-Reactive-yellowgreen)  

---

## 🔹 Project Overview

This project demonstrates a **microservices architecture** using Spring Boot with the following components:

1. **University Student Microservice**  
   - Manages student information: name, age, email, enrollment details.  
   - Exposes REST endpoints for CRUD operations.

2. **Address Microservice**  
   - Handles student addresses (city, state, country, postal code).  
   - Integrates with **Student Microservice** via **OpenFeign** and **WebClient**.

3. **Database**  
   - Each microservice uses **PostgreSQL** for persistent storage.  

---

## 🏗 Architecture Diagram

```text
+----------------+         +----------------+
| Student Service| <-----> | Address Service|
+----------------+         +----------------+
        |                         |
        v                         v
   PostgreSQL DB               PostgreSQL DB


