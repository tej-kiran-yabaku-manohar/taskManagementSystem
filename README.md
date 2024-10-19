# Task Management System

A RESTful Task Management System built using Spring Boot and an H2 in-memory database. This project demonstrates a simple API that allows users to create, update, delete, and view tasks, with additional features like filtering by status and marking tasks as completed.

## Features

- **Create Tasks**: Add new tasks with title, description, and due date.
- **Update Tasks**: Modify existing tasks (e.g., change title, description, or due date).
- **Delete Tasks**: Remove tasks by their ID.
- **View All Tasks**: Retrieve a list of all tasks with optional filtering by status.
- **Mark Tasks as Completed**: Update the status of a task to 'Completed'.
- **H2 In-Memory Database**: Uses an embedded H2 database for lightweight, fast development and testing.

## Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building the RESTful API.
- **H2 Database**: In-memory database for storing tasks.
- **Spring Data JPA**: For data persistence and interaction with the H2 database.
- **Maven**: Build tool for managing dependencies and running the project.

## Architecture

This project follows a clean architecture with the following layers:

1. **Controller Layer**: Manages HTTP requests and routes them to the correct service methods.
2. **Service Layer**: Contains business logic and orchestrates interactions between the controller and repository.
3. **Repository Layer**: Handles interaction with the database using Spring Data JPA.
4. **Model**: The `Task` entity represents the task object stored in the database.
5.  **Configuration**: application.properties contains the core configuration settings for the Spring Boot application (including H2 Database Configuration, JPA Configuration, Server Port), schema.sql file file defines the database schema, data.sql file pre-populates the database with some initial data when the application starts.

## Project Structure

```plaintext
task-manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── taskmanager/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               └── TaskManagerApplication.java
│   └── resources/
│       ├── application.properties
│       ├── schema.sql
│       └── data.sql
└── pom.xml
```
