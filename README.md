# Clinic Reservation Platform

This repository contains the codebase for the **Clinic Reservation Platform**, a web application built using **Spring Boot** and **MySQL**. The platform is designed to facilitate the booking and management of clinic appointments.

## Table of Contents

- [Features](#features)
- [Architecture](#architecture)
- [Requirements](#requirements)
- [Installation](#installation)
- [Configuration](#configuration)
- [Database Setup](#database-setup)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Features

- User registration and authentication
- Clinic and doctor management
- Appointment scheduling and management
- Search functionality for clinics and doctors
- Admin dashboard for managing users, clinics, and appointments

## Architecture

The application is built on a **Spring Boot** framework and follows a layered architecture:

- **Controller Layer**: Handles HTTP requests and responses.
- **Service Layer**: Contains business logic.
- **Repository Layer**: Interfaces with the MySQL database.
- **Model Layer**: Defines the entities and data transfer objects.

## Requirements

- **Java 17** or higher
- **Maven** 3.6+ 
- **MySQL** 8.0+ 
- **Git**

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/nimaiji/clinic-reservation-platform.git
    cd clinic-reservation-platform
    ```

2. Ensure all dependencies are installed by running:

    ```bash
    mvn clean install
    ```

## Configuration

Before running the application, you need to configure the MySQL database settings.

1. Open the `src/main/resources/application.properties` file.

2. Update the following properties with your MySQL configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/clinic_db
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

## Database Setup

1. Create a MySQL database named `clinic_db`:

    ```sql
    CREATE DATABASE clinic_db;
    ```

2. The application will automatically handle the creation and updating of tables on startup based on the JPA entities.

## Running the Application

1. Start the application using Maven:

    ```bash
    mvn spring-boot:run
    ```

2. The application will be accessible at `http://localhost:8080`.

## API Endpoints

The following are some of the key API endpoints available:

- **User Registration & Authentication**
  - `POST /api/auth/register` - Register a new user
  - `POST /api/auth/login` - Authenticate a user

- **Clinic Management**
  - `GET /api/clinics` - Get all clinics
  - `POST /api/clinics` - Add a new clinic

- **Appointment Management**
  - `GET /api/appointments` - Get all appointments
  - `POST /api/appointments` - Schedule a new appointment

For a full list of available endpoints and their details, inspect the controller classes.

## Testing

1. Unit and integration tests can be run using Maven:

    ```bash
    mvn test
    ```

2. Ensure that the test database configurations are correctly set up in `src/test/resources/application-test.properties`.

## Troubleshooting

- **Common Issues**:
  - Ensure that MySQL is running and accessible with the credentials provided.
  - Verify that the correct Java version is being used.

- **Logs**:
  - Check application logs in the console for detailed error messages.

## Contributing

Contributions are welcome! Please fork this repository and create a pull request with your changes. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
