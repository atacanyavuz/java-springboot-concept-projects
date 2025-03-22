# Kafka Communication Microservices Project

## 📌 Overview

This project demonstrates a simple microservice communication architecture using **Apache Kafka**.

### ✅ Producer Service
- Receives REST API requests.
- Saves the data into an **H2 database**.
- Publishes the data to a **Kafka Topic**.

### ✅ Consumer Service
- Listens to the Kafka Topic.
- Consumes incoming messages.
- Stores the consumed data into its own **H2 database**.

---

## 🧩 Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Apache Kafka
- H2 Database (In-Memory)
- Docker
- Lombok

---

## 📚 Project Structure
![System Architecture Diagram](/springboot-concept-projects/kafka-event-streaming-platform/resources/diagrams/Kafka%20Event%20Streaming%20Platform%20Project.png)
