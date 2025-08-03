# employee-crud-springboot-h2

This is a simple CRUD application built with **Spring Boot**, **Spring Data JPA**, and an **embedded H2 database**.  
It provides a RESTful API for managing employee records, including basic Create, Read, Update, and Delete operations.

## ✅ Features

- REST API for basic employee management
- Embedded **H2** database (in file mode)
- Auto table creation via Hibernate (`ddl-auto=update`)
- Clean project structure with Controller, Repository, Entity
- Easy to extend and adapt

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- H2 Database (embedded)
- Maven

## 🚀 Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/your-username/employee-crud-springboot-h2.git
cd employee-crud-springboot-h2

2. Run the application
Open in your IDE (e.g. Spring Tool Suite, IntelliJ)

Run SpringH2InEmbeddedApplication.java

3. Access the application
Resource	URL
API	http://localhost:8080/employee
H2 Console	http://localhost:8080/h2-console

JDBC URL: jdbc:h2:./employeedb
User: sa
Password: sa123

📄 API Endpoint Overview
Method	Endpoint	Description
GET	/employee	Returns all employees

👉 You can extend this project to support:

POST for creating new employees

PUT for updating existing entries

DELETE for deleting entries

📂 Project Structure
kotlin
Kopieren
Bearbeiten
net.codejava
├── Employee.java          → Entity class
├── EmployeeRepository.java → Repository interface
├── EmployeeController.java → REST Controller
└── SpringH2InEmbeddedApplication.java → Main app class
⚙️ Configuration (application.properties)
properties
Kopieren
Bearbeiten
spring.datasource.url=jdbc:h2:./employeedb
spring.datasource.username=sa
spring.datasource.password=sa123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
📌 License
This project is provided for educational or demonstration purposes.
Feel free to fork and adapt it to your needs.
