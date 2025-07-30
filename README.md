# Spring Boot API Test Project

This is a simple Spring Boot RESTful API project that demonstrates basic CRUD (Create, Read, Update, Delete) operations using:

- Spring Boot
- In-Memory H2 Database
- Spring Data JPA
- REST APIs (GET, POST, PUT, DELETE)
- Tested via Postman

---

## 🔧 Features

- ✅ Create a resource using `POST`
- ✅ Read all resources or a single resource using `GET`
- ✅ Update a resource using `PUT`
- ✅ Delete a resource using `DELETE`
- ✅ All data is stored temporarily using H2 in-memory database
- ✅ API tested using Postman

---

## 🛠️ Tech Stack

- Java 23
- Spring Boot 
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🚀 How to Run the Project

### Prerequisites

- Java JDK installed
- Maven installed
- Any IDE (like IntelliJ IDEA, Eclipse, VS Code)

### Steps

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/springboot-api-test-project.git
   cd springboot-api-test-project
Run the application:

bash
Copy
Edit
./mvnw spring-boot:run
Or run it from your IDE.

🔗 API Endpoints
Base URL: http://localhost:8080/api

Method	Endpoint	Description
GET	/api/items	Get all items
GET	/api/items/{id}	Get item by ID
POST	/api/items	Create new item
PUT	/api/items/{id}	Update item by ID
DELETE	/api/items/{id}	Delete item by ID

Replace items with your actual entity/resource name.

🗃️ H2 Database Console
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

Make sure H2 Console is enabled in application.properties.

🧪 Testing with Postman
Import the API endpoints in Postman.

Use the example requests:

POST: Send JSON body to create item

GET: Retrieve items

PUT: Update existing item

DELETE: Delete item by ID

📁 Folder Structure
css
Copy
Edit
src
├── main
│   ├── java
│   │   └── com.example.apitest
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       └── Application.java
│   └── resources
│       ├── application.properties
│       └── data.sql (optional)
📄 License
This project is for educational and testing purposes only.

🙋‍♂️ Author
Nethaji K
Feel free to fork this repo and use it for learning or testing.

---
