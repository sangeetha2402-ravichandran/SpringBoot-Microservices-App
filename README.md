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

## ⚡ Features

* ✅ Spring Boot Microservices
* ✅ Inter-service communication using OpenFeign & WebClient
* ✅ PostgreSQL integration for persistent storage
* ✅ CRUD APIs for Student and Address
* ✅ Exception Handling & Validation

---

## 🚀 Tech Stack

| Component     | Technology           |
| ------------- | -------------------- |
| Framework     | Spring Boot 3.3.x    |
| Service Calls | OpenFeign, WebClient |
| Database      | PostgreSQL           |
| Build Tool    | Maven                |
| Java Version  | 17+                  |
| API Testing   | Postman / Swagger    |

---

## 📦 Setup & Run

### 1. Clone Repository


```bash
git clone https://github.com/sangeetha2402-ravichandran/SpringBoot-Microservices-App.git

---

 🏗 Architecture Diagram


+----------------+         +----------------+
| Student Service| <-----> | Address Service|
+----------------+         +----------------+
        |                         |
        v                         v
   PostgreSQL DB               PostgreSQL DB



