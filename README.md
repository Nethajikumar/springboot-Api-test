# 📝 Spring Boot To-Do List API

A simple RESTful API for managing a to-do list, built with **Spring Boot**.  
This project demonstrates the core CRUD operations and is tested using **Postman**.

---

## 🚀 Features

- ✅ Add a new to-do item
- 📋 Get all to-do items
- 🔍 Get a to-do item by ID
- 📝 Update a to-do item
- ❌ Delete a to-do item

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 (In-memory database)** or MySQL
- **Postman** for testing

---

## 📦 How to Run

1. **Clone the repository:**

```bash
git clone https://github.com/Nethajikumar/springboot-todo-crud.git
cd springboot-todo-crud

Run the application using Maven:

bash
Copy
Edit
./mvnw spring-boot:run
Or using Maven directly:

bash
Copy
Edit
mvn spring-boot:run
Visit: http://localhost:8080

🔌 API Endpoints
Method	Endpoint	Description
GET	/api/todos	Get all todos
GET	/api/todos/{id}	Get todo by ID
POST	/api/todos	Create new todo
PUT	/api/todos/{id}	Update todo by ID
DELETE	/api/todos/{id}	Delete todo by ID

📬 Sample JSON (POST/PUT)
json
Copy
Edit
{
  "title": "Learn Spring Boot",
  "description": "Build a CRUD API",
  "completed": false
}
🧪 Testing with Postman
You can import the Postman collection (coming soon...) or test manually using:

GET/POST/PUT/DELETE methods

URL: http://localhost:8080/api/todos

📁 Project Structure
css
Copy
Edit
src/
 └── main/
     └── java/
         └── com/example/todo/
             ├── controller/
             ├── service/
             ├── repository/
             └── model/
 └── resources/
     └── application.properties
🙏 Acknowledgement
Project inspired by learning tutorials on YouTube.
Special thanks to the Spring Boot open-source community.

📃 License
This project is open-source and available for educational use.

yaml
Copy
Edit

---

## ✅ After adding the README:

1. Save it as `README.md` in your project folder.
2. Run the following commands in terminal:

```bash
git add README.md
git commit -m "Added project README"
git push
