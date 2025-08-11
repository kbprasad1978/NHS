# NHS
nhs assignment
 NHS Jobs - Functional Acceptance Automation Test Suite

This repository contains a BDD-style Functional Acceptance Test Suite for testing the NHS Jobs search functionality.

## 📌 Project Overview

This suite automates the user story:

> As a jobseeker on NHS Jobs website, I want to search for a job with my preferences so that I can get recently posted job results.

The automation covers:
- Job search functionality
- Filtering and sorting by date
- Executing tests on Chrome and Firefox
- Cucumber BDD framework with Selenium and Java

---

## 🧪 Technologies Used
- **Java 21**
- **Cucumber** for BDD
- **Selenium WebDriver**
- **JUnit** for runner
- **WebDriverManager** for automatic driver management
- **Maven** for build and execution

---

## 🚀 How to Run Tests from Command Line

Make sure Java and Maven are installed and available in your system PATH.

### 📁 Step 1: Clone the Repository

```bash
git clone https://github.com/your-username/NHSBSA.git
cd NHSBSA
🧹 Step 2: Clean and Build the Project
bash
Copy
Edit
mvn clean install
🧪 Step 3: Run Tests
For Chrome:
bash
Copy
Edit
mvn test -Dbrowser=chrome
For Firefox:
bash
Copy
Edit
mvn test -Dbrowser=firefox
📝 Note: You don't need to download Chrome or Firefox drivers manually. WebDriverManager handles that automatically.
