#  Deepthought-task1 – Container Slot Picker API (Spring Boot)

A real-world backend system designed to intelligently pick the best available slot in a container yard.  
Built using **Spring Boot** and **Java**, this REST API mimics logistics infrastructure where containers are efficiently placed based on proximity, size, and storage needs.

---

##  Problem Statement

Logistics companies need to assign arriving containers to optimal yard slots.  
This backend service solves that by selecting the **most suitable slot** based on:

-  Shortest distance to target position
-  Size compatibility (small or big)
- ❄ Cold unit requirement (if needed)
-  Whether the slot is already occupied

---

##  Tech Stack

| Tool        | Purpose                      |
|-------------|------------------------------|
| Java 17     | Core programming language     |
| Spring Boot | Web layer & dependency management |
| Maven       | Build & dependency management |
| REST API    | Communication                 |
| JSON        | Data exchange format          |

---

## ⚙ How to Run the Project

```bash
# 1. Clone the repo
git clone https://github.com/YOUR_USERNAME/Deepthought-task1.git
cd Deepthought-task1

# 2. Build the project
mvn clean install

# 3. Run the app
mvn spring-boot:run
