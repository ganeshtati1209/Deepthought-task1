#  Deepthought Task 1 – Pick-a-Spot API (Spring Boot)

This project is a solution to the **Deepthought Big Data Backend Developer Task 1**.  
It provides a REST API to determine the **best available slot** in a yard for placing a container, based on given criteria like:

- **Proximity (Manhattan distance)**
- **Container size compatibility**
- **Cold storage requirement**
- **Slot availability**

---

##  Tech Stack

- Java 17
- Spring Boot 3.x
- Maven
- RESTful API
- JSON (request/response)

---

##  How to Run

###  Prerequisites

- Java 17+
- Maven
- Git

###  Setup Steps

```bash
git clone https://github.com/YOUR_USERNAME/Deepthought-task1.git
cd Deepthought-task1
mvn clean install
mvn spring-boot:run
