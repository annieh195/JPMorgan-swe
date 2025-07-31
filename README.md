# 🧑‍💻 JPMorgan Chase Advanced Software Engineering Virtual Experience

Welcome to my repository for the **JPMorgan Chase Advanced Software Engineering program**, hosted on [Forage](https://www.theforage.com/simulations/jpmorgan/advanced-software-engineering-r0fm). This repo documents my solution to a realistic simulation of backend engineering tasks, modeled after what engineers do at JPMorgan Chase.

The purpose of the project is to give participants a hands-on taste of the tools and workflows used by J.P. Morgan technologists and to build practical skills in a risk-free environment. Over the course of the program, I completed five structured tasks spanning everything from initial project setup to integrating external APIs.

---

## 📦 Project Overview

The **Midas** system mimics a simplified transaction processing pipeline with the following key components:

- A **Kafka producer and consumer** for publishing and reading transactions.
- A **Spring Boot backend** that ingests, validates, and stores transaction data.
- Integration with an external **Incentive API** that rewards users.
- An exposed `/balance` endpoint that returns the current balance of a user.

---

## ✅ Key Tasks

### Task 1: Project Setup and Environment Configuration
Set up the development environment and the base project. This involved installing and configuring Java and Maven, forking/cloning the starter repository, and building the project for the first time. I verified that the project (a Spring Boot application) ran locally and all initial setup steps were completed successfully. This task laid the groundwork for subsequent tasks by ensuring the project’s foundation was solid.

### Task 2: Kafka Integration and Stream Handling
Integrated Apache Kafka into the Spring Boot application for real-time data streaming. In this task, I configured the project to connect with a Kafka broker and implemented a message listener (consumer) to process incoming data (e.g. transaction messages) from a Kafka topic. This feature simulates a high-throughput messaging system, ensuring the application can handle streaming data. By the end of this task, the application was able to consume and process events from Kafka in real-time.

### Task 3: H2 Database Integration
Connected the application to an H2 in-memory database for data storage and retrieval. Using Spring Data JPA, I set up entities and repositories to store transaction records and user account balances in the H2 database. This task involved writing SQL or JPA queries and ensuring data consistency (e.g. validating transactions before saving). With the H2 integration, the application can persist data in-memory, allowing for quick queries and verifications of financial transaction data.

### Task 4: REST API Development with Spring Boot
Built and exposed RESTful API endpoints using Spring Boot (Spring MVC). In this task, I created a new controller to expose internal data via HTTP endpoints (for example, an endpoint to retrieve a user’s account balance). This API exposure allows external clients or services to query the application for information in a controlled manner. I tested the endpoint to ensure it returns the correct data from the H2 database and handles edge cases (such as invalid requests or missing data) gracefully.

### Task 5: External API Integration and Testing
Integrated an external REST API service into the application and verified its functionality. Specifically, I connected the application to a hypothetical external Incentive API (as per program instructions) to apply bonus incentives to certain transactions. This required making outbound REST calls from the Spring Boot app and handling the responses. I implemented logic so that when a new transaction is processed, the external API is called to adjust the recipient’s balance by any incentive, without affecting the sender’s balance (ensuring accurate financial data management). I also wrote tests (and used tools like Postman) to confirm that the external API integration works correctly and that all components – Kafka stream, database, and APIs – interact seamlessly as a whole.

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Maven**
- **Apache Kafka**
- **H2 Database**
- **RESTful APIs**
- **JUnit 5 for Testing**

---

## 🛠 Prerequisites

Make sure you have the following installed:

- **Java 17 JDK**
- **Maven** (or use the included Maven Wrapper)
- **Git**
- (Optional) IntelliJ IDEA (recommended for running tests easily)

---

## 🧪 Setup Instructions

1. **Clone this repository**:
   ```bash
   git clone https://github.com/annieh195/JPMorgan-swe.git
   cd JPMorgan-swe
   ```

2. **Install Java 17 and Set It Up**:
- Download Java 17 [here](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Set your JAVA_HOME environment variable:
   - macOS/Linux:
     ```bash
     export JAVA_HOME=$(/usr/libexec/java_home -v17)
     export PATH=$JAVA_HOME/bin:$PATH
     ```
   - Windows:
     - Set JAVA_HOME to your Java 17 installation path
     - Add %JAVA_HOME%\bin to your system PATH


3. **Running the Tests**:
   **Use an IDE to Run Tests via GUI or Terminal**

    If you're using IntelliJ IDEA, you can:
   - Right-click the src/test/java folder → click "Run All Tests"
   - Or use IntelliJ's built-in terminal and run:
   ```bash
   ./mvnw test     # if Maven Wrapper exists
   ```
   
   If you're not using the wrapper, run:
   ```bash
   mvn test
   ```

---

## 💡 What I Learned

This program sharpened my skills in:

- Architecting Spring Boot microservices
- Working with Kafka for real-time data streaming
- Persisting and querying relational data using JPA + H2
- Integrating external RESTful services
- Writing and running integration tests
- Debugging large multi-service applications

---

## 🧾 Certificate

✅ I’ve completed this virtual internship and received the official certificate from Forage and JPMorgan.

[🎓 View Certificate](https://forage-uploads-prod.s3.amazonaws.com/completion-certificates/Sj7temL583QAYpHXD/E6McHJDKsQYh79moz_Sj7temL583QAYpHXD_3iSYNtqLNwSfM2aDW_1753951530203_completion_certificate.pdf)

---

## 🙌 Acknowledgements

- **JPMorgan Chase & Co.** for designing this excellent Software Engineering Virtual Experience program and providing detailed, real-world-inspired tasks. The guidance and scenario provided by J.P. Morgan made the simulation enriching and educational.

- **Forage** for hosting the virtual internship platform and making this experience accessible to students and learners globally. The Forage platform enabled a self-paced, hands-on learning journey that closely mimics an actual internship.
  By completing this program, I gained practical experience in technologies like Java, Spring Boot, Kafka, and REST APIs and a deeper understanding of how modern fintech applications are built. Thank you to everyone involved in making this virtual experience possible!