# 🛒 E-Commerce Backend API – Java Spring Boot

This is a **Java Spring Boot** backend-only e-commerce project, developed as a learning experience to explore modern enterprise application development.
It demonstrates how to build a **secure**, **modular**, and **scalable** web service using best practices in backend architecture.

---

## 🧩 Features & Technology Breakdown

Each technology was selected for a specific purpose to reflect real-world backend development standards:

---

### ✅ Spring Boot with MVC Architecture

Streamlines project setup and enforces a clean separation between **controllers**, **services**, and **data layers**.
Enables rapid development while maintaining an organized and scalable codebase.

---

### 🌐 RESTful API with `@RestController`

Exposes clean, **stateless HTTP endpoints** that follow REST principles.
Easily integratable with any frontend technology like **React**, **Angular**, **Vue**, or **mobile applications**.

---

### 🗄️ PostgreSQL for Database Management

A robust, production-grade relational database used for persisting application data such as **users**, **products**, and **orders**.

---

### 🔐 Spring Security with Manual Configuration

Security is **manually configured** to give you full control over **authentication** and **authorization logic**.
Provides fine-grained protection of endpoints based on **user roles and permissions**.

---

### 🔑 JWT (JSON Web Token) Authentication

Implements **stateless session management**.
After successful login, a **JWT token** is issued to the user.

That token is required in all subsequent requests to access **protected routes**.

---

### 🧬 Hibernate (JPA) with Annotations

Facilitates **Object-Relational Mapping (ORM)** between Java classes and database tables.

This project uses:

* **JPA repository methods** for standard CRUD operations
* **Manual/native SQL queries** for custom, complex queries

All configuration is done using **annotations**, ensuring a clean and decoupled setup.

---

### ⚙️ Aspect-Oriented Programming (AOP)

Used to implement **cross-cutting concerns** without cluttering business logic.

Key usages include:

* **Performance Monitoring**: Measures and logs execution time of key methods
* **Logging with SLF4J**: Tracks application behavior and events cleanly and efficiently

---

### 🧪 Backend-Only (No Frontend Included)

This project contains **only the backend API**. No UI or frontend code is included.

You can:

* **Test endpoints using Postman, Insomnia, or similar tools**
* **Easily connect a frontend** built with your preferred framework or mobile client

---

## 🔐 How Authentication Works

1. A client sends a **POST** request with login credentials to the `/login` endpoint.

2. If the credentials are valid, the server responds with a **JWT token**.

3. The client must include the token in the **Authorization** header of subsequent requests:

   ```
   Authorization: Bearer <your_token_here>
   ```

4. For each protected endpoint, the token is validated and access is granted **based on roles and permissions**.

This approach ensures secure, **stateless** communication between clients and the backend API.


---

## 🧰 Tech Stack Summary

| Technology          | Purpose                                                                 |
| ------------------- | ----------------------------------------------------------------------- |
| **Java**            | Primary programming language                                            |
| **Spring Boot**     | Simplifies application setup and supports MVC architecture              |
| **Spring Security** | Secures the API through manual configuration and JWT-based auth         |
| **JWT**             | Provides stateless, token-based authentication                          |
| **PostgreSQL**      | Stores relational data with strong support for production environments  |
| **Hibernate (JPA)** | Maps Java objects to PostgreSQL tables using annotations and native SQL |
| **AOP (AspectJ)**   | Implements cross-cutting concerns like performance tracking and logging |
| **SLF4J**           | Enables clean, standardized logging without polluting business logic    |

---

## 🚀 Setup Instructions

1. **Clone the Repository**

   ```
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
   ```

2. **Configure PostgreSQL and Application Properties**

   Open the `src/main/resources/application.properties` file and update the following settings:

   ```
   # PostgreSQL Configuration
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password

   # Hibernate Settings
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

   # JWT Settings
   jwt.secret=yourSecretKey
   jwt.expiration=3600000  # token validity in ms
   ```

3. **Create the PostgreSQL Database**

   If not created already:

   ```
   CREATE DATABASE your_database_name;
   ```

4. **Build and Run the Application**

   If using Maven wrapper (Linux/macOS):

   ```
   ./mvnw spring-boot:run
   ```

   On Windows:

   ```
   mvnw.cmd spring-boot:run
   ```

5. **Test the API**

   * Base URL: `http://localhost:8080`
   * Use Postman or any other REST client
   * First authenticate with `/auth/login` to get a JWT token
   * Add `Authorization: Bearer <token>` to headers for secured endpoints

---

## 📦 Example Use Cases

* **Register/Login**: Users can create accounts and authenticate using email/password.
* **Token-Based Access**: Once authenticated, users receive a JWT used for accessing protected routes.
* **Product/Order Management**: Add logic for CRUD operations (example: add products, manage inventory).
* **Role-Based Access**: Different endpoints can be secured by user roles using Spring Security.

*(You can expand these features as needed depending on your roadmap.)*

---

## 📪 Contact

Feel free to reach out:

**Email**: [65mirhossin@gmail.com](mailto:65mirhossin@gmail.com)

---

## 📄 License

This project is licensed under the **Beerware License (Revision 42)**.

> “You can do whatever you want with this stuff.  
> If we meet some day, and you think this stuff is worth it,  
> you can buy me a beer in return.”


