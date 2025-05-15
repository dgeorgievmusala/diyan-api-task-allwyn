# 📘 Diyan API Test Framework (Allwyn)

This is a Java-based API test automation framework using REST Assured, TestNG, Allure Reports, and Faker for dynamic test data generation.

---

## 📂 Project Structure

```
project-root/
├── pom.xml
├── README.md
├── testng.xml
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/              # TestNG test classes
│   │   │   ├── payloads/           # POJOs for API requests
│   │   │   ├── endpoints/          # API endpoint paths
│   │   │   ├── specifications/     # Request/response specs
│   │   │   └── utils/              # Faker utilities
│   │   └── resources/
│   │       └── allure.properties   # Allure results directory
```

---

## 🔧 Setup Instructions

### ✅ Prerequisites

- Java 17+
- Maven 3+
- Allure CLI (for reporting)  
  Install: https://docs.qameta.io/allure/#_installing_a_commandline

### 📦 Install Dependencies

```
mvn clean install
```

---

## 🚀 Running Tests

### 🔹 Run All Tests

```
mvn clean test
```

### 🔹 Generate Allure Report

```
allure serve target/allure-results
```

> Note: `allure.properties` is configured to output to `target/allure-results`.

---

## ✅ Test Coverage

### 📚 Authors API

- `GET /api/v1/Authors` – Retrieve all authors
- `GET /api/v1/Authors/{id}` – Get author by ID
- `POST /api/v1/Authors` – Create new author (including edge case tests)
- `PUT /api/v1/Authors/{id}` – Update author
- `DELETE /api/v1/Authors/{id}` – Delete author

### 📚 Books API

- `POST /api/v1/Books` – Create new book
- `GET /api/v1/Books` – Retrieve all books
- `GET /api/v1/Books/{id}` – Get book by ID
- `PUT /api/v1/Books/{id}` – Update book
- `DELETE /api/v1/Books/{id}` – Delete book

### 🔎 Test Types

- ✅ **Positive Tests** – Valid inputs and expected 200/201 responses
- ❌ **Negative Tests** – Invalid/malformed requests (400/422)
- 🧪 **Edge Cases** – Long names, emojis, non-Latin characters, boundaries

---

## 📦 Tools Used

- **Java 17**
- **REST Assured**
- **TestNG**
- **Faker (javafaker)**
- **Allure Reports**
- **Jackson / Gson / JSON**

---

## 🤝 Contribution

Feel free to fork and contribute additional scenarios or framework enhancements.

---

## 📬 Contact

**Author:** Allwyn | Diyan Task Project  
If you have questions, raise an issue or contact via your team’s preferred channel.
