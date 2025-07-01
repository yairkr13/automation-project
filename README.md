# 🧪 Automation Framework

A comprehensive test automation framework built as part of an academic course in software testing & automation.  
Designed to simulate real-world automation projects from scratch, including web, API, and mobile testing.

---

## 📌 Project Overview

This framework demonstrates the principles of maintainable and scalable automation in real-world scenarios:

- Web UI Testing with **Selenium WebDriver**
- **TestNG** for test execution and assertions
- Modular **Page Object Model (POM)** architecture
- **Jenkins CI** integration for continuous testing
- **Docker** setup for isolated environments
- **Mobile Automation** using **Appium**
- **API Testing** and utilities for backend verification
- Multi-browser support: Chrome, Firefox, IE, Edge, Opera

---

## 🧠 Technologies

| Tool/Concept | Usage |
|--------------|-------|
| **Java** | Primary language |
| **Selenium WebDriver** | Web automation |
| **Appium** | Mobile automation |
| **TestNG** | Test management & assertions |
| **Page Object Model** | Scalable test architecture |
| **Jenkins** | Continuous Integration |
| **Docker** | Isolated test environment |
| **XPath/CSS** | Element locators |
| **Android Studio** | Emulators & mobile testing |
| **REST API tools** | Basic backend checks |

---

## 📁 Project Structure

- `src/main/java` – App logic: helpers, drivers, utilities
- `src/test/java` – Test classes (web, appium, API)
- `resources/` – Properties, config, testNG.xml
- `Profile/` – Drivers for Windows/macOS/Linux
- `pom.xml` – Maven dependencies and build config

---

## 🚀 How to Run

1. Clone the project  
2. Install required browser drivers (already included for most platforms)  
3. Make sure `application.properties` is properly configured  
4. Run via TestNG or Jenkins

```bash
mvn clean test
```

---

## 🧪 Test Types Implemented

- Smoke and sanity tests for login and registration
- End-to-end flows using POM
- Mobile UI test using Appium
- Basic API integration tests
- Negative test scenarios with input validation
- Cross-browser testing

---

## 📚 Background

This project was developed during the course:  
**"Introduction to Software Testing and Automation"**  
(Hadassah College, 3rd year – B.Sc. in Computer Science)

Course highlights:
- Selenium WebDriver
- Page Object Pattern
- CI/CD with Jenkins
- Docker containers for testing
- Appium-based mobile testing
- API & backend validation
- Realistic project simulation including bug reporting and test planning

---

## 👨‍💻 Author

**Yair Krothamer**  
📧 yairk1998@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/yair-krothamer-8b0448230)
---

## 📌 Notes

- Project follows clean code principles and modular architecture
- No external frameworks used (built from scratch)
- Inspired by real QA infrastructure in production teams

---
