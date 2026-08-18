# Hospitality Management System

A Java-based Hospitality Management System developed using Java Swing, JDBC, and MySQL. The application provides a desktop interface for managing hotels, rooms, guests, and reservations.

## Features

- Hotel Management
- Room Management
- Guest Management
- Reservation Management
- CRUD Operations
- MySQL Database Integration
- JDBC Connectivity
- Java Swing GUI
- Retrieve Data using JTable

## Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- Eclipse IDE
- Git & GitHub

## Project Structure

```text
HospitalityManagementSystem
│
├── src
│   ├── dao
│   │   ├── HotelDAO.java
│   │   ├── RoomDAO.java
│   │   ├── GuestDAO.java
│   │   └── ReservationDAO.java
│   │
│   ├── database
│   │   └── DatabaseConnector.java
│   │
│   ├── entity
│   │   ├── Hotel.java
│   │   ├── Room.java
│   │   ├── Guest.java
│   │   └── Reservation.java
│   │
│   └── gui
│       ├── HospitalityGUI.java
│       ├── AddHotelForm.java
│       ├── AddRoomForm.java
│       ├── AddGuestForm.java
│       ├── AddReservationForm.java
│       └── ViewDataForm.java
│
└── module-info.java
-----Database--------

The application uses MySQL with the following main tables:

Hotel
Room
Guest
Reservation

---How to Run-----
Install Java JDK.
Install MySQL.
Create the required database and tables.
Configure the database connection in DatabaseConnector.java.
Open the project in Eclipse.
Add the required JDBC driver.
Run HospitalityGUI.java.
Application Interface

The application provides separate interfaces for:

Adding Hotels
Adding Rooms
Adding Guests
Adding Reservations
Retrieving stored data
Author

Chhavi Nagariya

B.Tech CSE
