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
