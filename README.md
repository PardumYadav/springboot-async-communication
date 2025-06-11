# springboot-async-communication
 Spring Boot Async Communication.  This project demonstrates asynchronous communication between two Spring Boot applications  (App1 and App2) using both RestTemplate

 ## 🧩 Project Overview

- **App1**: Sends asynchronous HTTP requests to another microservice.
- **App2**: Responds to incoming HTTP requests.
- Communication is done using:
  - `RestTemplate`
  

---

## 🧱 Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Async (`@Async`)
- Maven

---

## 🏗️ Project Structure

### App1 (Client)
- Sends requests to App2
- Uses `@Async` to make non-blocking calls
- Contains two services:
  - `sendMessageToApp2()`
  - `sendMessageToApp2Delayed()`

### App2 (Server)
- Responds with a static message on the endpoint `/app2/message`.

---

## 🔁 Communication Flow

### RestTemplate
