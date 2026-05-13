# First REST API - Spring Boot

## Overview

This project is a RESTful API developed using Spring Boot.

It implements full CRUD operations for managing products and demonstrates backend development fundamentals including:
- REST API development
- database integration using H2
- API documentation using Swagger/OpenAPI
- exception handling using `@ControllerAdvice`

---

## Features

- Create a new product
- Retrieve all products
- Retrieve a product by ID
- Update an existing product
- Delete a product
- Exception handling with proper HTTP status codes
- In-memory database using H2
- API documentation using Swagger/OpenAPI

---

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger / OpenAPI

---

## Project Structure

```plaintext
src/main/java/com/djenna/firstrestapi/product/
├── api         # REST controllers and request/response DTOs
├── domain      # Entity classes
├── repository  # Data access layer
├── service     # Business logic
└── support     # Mappers and exception handling

---------------------------------------------
How to Run
1. Clone the repository
git clone https://github.com/Djenna07/first-rest-api.git

2. Open the project in IntelliJ IDEA

3. Run the application

Run:

FirstRestApiApplication.java
----------------------------------------
API Endpoints:

Method	Endpoint	Description
GET	/api/v1/products	Get all products
GET	/api/v1/products/{id}	Get product by ID
POST	/api/v1/products	Create a new product
PUT	/api/v1/products/{id}	Update a product
DELETE	/api/v1/products/{id}	Delete a product

------------------------------
Swagger UI

Access the API documentation at:

http://localhost:8080/swagger-ui/index.html
---------------------------------------

H2 Database Console:

Access the H2 database console at:

http://localhost:8080/h2-console
JDBC URL
jdbc:h2:mem:testdb
-----------------
Exception Handling

The application includes global exception handling using:

ProductNotFoundException
@ControllerAdvice

When a product is not found, the API returns:

404 NOT FOUND

instead of a generic server error.
------------------------------

Example JSON Request:

Create Product
{
  "name": "Phone"
}
Update Product
{
  "name": "Updated Phone"
}
