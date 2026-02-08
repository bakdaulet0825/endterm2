# Project Overview
This project is a Spring Boot application for managing students, courses, and enrollments.
It provides a RESTful API for CRUD operations on students and courses, and tracks which students are enrolled in which courses.
## REST API Endpoints

### Students
- `GET /students` - Get all students
- `POST /students` - Create a new student
- `PUT /students/{id}` - Update a student
- `DELETE /students/{id}` - Delete a student

### Courses
- `GET /courses` - Get all courses
- `POST /courses` - Create a course
- `PUT /courses/{id}` - Update a course
- `DELETE /courses/{id}` - Delete a course

### Enrollments
- `GET /enrollments` - Get all enrollments
- `POST /enrollments` - Enroll a student in a course!
- `DELETE /enrollments/{id}` - Delete an enrollment

![Снимок экрана 2026-02-08 214030.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214030.png)
![Снимок экрана 2026-02-08 214537.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214537.png)
![Снимок экрана 2026-02-08 214542.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214542.png)
![Снимок экрана 2026-02-08 214549.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214549.png)
![Снимок экрана 2026-02-08 214606.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214606.png)
![Снимок экрана 2026-02-08 214612.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214612.png)
![Снимок экрана 2026-02-08 214622.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214622.png)
![Снимок экрана 2026-02-08 214628.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214628.png)
![Снимок экрана 2026-02-08 214641.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214641.png)
![Снимок экрана 2026-02-08 214647.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202026-02-08%20214647.png)

## Design Patterns Used

### Singleton
Used in service classes to ensure only one instance is used throughout the application.

### Factory
Used to create entity objects before saving to the database (optional/if implemented).

### Builder
Used to construct complex objects like Enrollment with multiple associated entities (optional/if implemented).

## Component Principles

- Controllers: handle HTTP requests and responses
- Services: contain business logic
- Repositories: handle database operations
- Models: represent database entities

## SOLID & OOP Summary

- **Single Responsibility Principle:** Each class has one responsibility
- **Open/Closed Principle:** Application can be extended without modifying existing code
- **Liskov Substitution Principle:** Subtypes can replace base types (e.g., service interfaces)
- **Interface Segregation Principle:** No large interfaces; only relevant methods are exposed
- **Dependency Inversion Principle:** Controllers depend on services, not repositories directly

- **OOP Concepts:** Inheritance (optional), Encapsulation (fields private, getters/setters), Polymorphism (optional)

## Database Schema

### Students
| Column | Type | Constraint |
|--------|------|------------|
| id     | int  | PK, auto-generated |
| name   | varchar(255) | not null |
| email  | varchar(255) | unique, not null |

### Courses
| Column | Type | Constraint |
|--------|------|------------|
| id     | int  | PK, auto-generated |
| name   | varchar(255) | not null |
| credits| int  | not null |

### Enrollments
| Column | Type | Constraint |
|--------|------|------------|
| id       | int  | PK, auto-generated |
| student_id | int | FK -> students.id, not null |
| course_id  | int | FK -> courses.id, not null |
![Architecture.png](../../../OneDrive/%D0%98%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F/Screenshots/Architecture.png)
## Running the Application

1. Clone the repository
2. Make sure PostgreSQL is running and database is created
3. Set your `application.properties`:
    - spring.datasource.url
    - spring.datasource.username
    - spring.datasource.password
4. Run the application using:
   ```bash
   mvn spring-boot:run
5. Access API via Postman at http://localhost:8080

---

## **I. Reflection Section**

```markdown
## Reflection

This project taught me:
- How to structure a Spring Boot REST API
- How to use JPA repositories for CRUD operations
- Challenges of managing entity relationships (Enrollment)
- Importance of following SOLID and OOP principles
- How to document APIs and create Postman collections
