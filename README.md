# First REST API - Spring Boot

-Overview

This project is a RESTful API developed using Spring Boot.
It implements basic CRUD operations for managing products and demonstrates backend development fundamentals including database integration and API documentation.

---

 -Features

* Create a new product
* Retrieve all products
* Retrieve a product by ID
* In-memory database using H2
* API documentation using Swagger (OpenAPI)

---

 -Technologies

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Swagger / OpenAPI

---

  -Project Structure

```plaintext
src/main/java/com/djenna/firstrestapi/product/
├── api        # Controllers (REST endpoints)
├── domain     # Entity classes
├── repository # Data access layer
├── service    # Business logic
└── support    # Mappers
```

---

-How to Run

1. Clone the repository:

```bash
git clone https://github.com/Djenna07/first-rest-api.git
```

2. Open the project in IntelliJ IDEA

3. Run:

```bash
FirstRestApiApplication.java
```

---

  -API Endpoints

| Method | Endpoint              | Description       |
| ------ | --------------------- | ----------------- |
| GET    | /api/v1/products      | Get all products  |
| GET    | /api/v1/products/{id} | Get product by ID |
| POST   | /api/v1/products      | Create product    |

---

   -Swagger UI

Access the API documentation at:

```
http://localhost:8080/swagger-ui/index.html
```

---

    -Database

Access the database console at:

```
http://localhost:8080/h2-console
```

JDBC URL:

```
jdbc:h2:mem:testdb
```

---

