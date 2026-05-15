# Movie Booking Application

A Spring Boot Movie Booking Application developed using:

- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Features

- User Registration
- User Login
- PVR Booking
- INOX Booking
- Movie and Screen Management
- REST APIs
- Transaction Management

## Technologies Used

- Java 17
- Spring Boot
- Hibernate ORM
- MySQL
- Maven
- Postman

## Entity Relationships

- One User can book multiple cinemas
- One Cinema can contain multiple screens
- One Screen contains one Movie

## Project Structure

- Controller Layer
- Service Layer
- Repository Layer
- Entity Layer

## APIs

### User APIs

- POST `/users/register`
- POST `/users/login`
- GET `/users`

### PVR APIs

- POST `/pvr/book`
- GET `/pvr`

### INOX APIs

- POST `/inox/book`
- GET `/inox`

## Database

MySQL Database:
`movie_booking_db`

## Author

Soumick
