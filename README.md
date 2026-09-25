# 🏨 Hospitality Management System

A Java-based desktop application for managing hotels, rooms, guests, and reservations.

Built using **Java Swing, JDBC, and MySQL**, this project demonstrates CRUD operations, database connectivity, and a structured DAO-based architecture.

## ✨ Features

- 🏨 Hotel Management
- 🛏️ Room Management
- 👤 Guest Management
- 📅 Reservation Management
- ➕ Add hotel, room, guest, and reservation records
- 📋 Retrieve and display data using JTable
- 🔄 CRUD Operations
- 🗄️ MySQL Database Integration
- 🔌 JDBC Connectivity
- 🖥️ Java Swing GUI

## 🛠️ Technologies Used

- **Java**
- **Java Swing**
- **JDBC**
- **MySQL**
- **Eclipse IDE**
- **Git & GitHub**

## 📂 Project Structure

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
🗄️ Database

The application uses MySQL with the following main tables:

Hotel
Room
Guest
Reservation

The application connects to the database using JDBC through DatabaseConnector.java.

▶️ How to Run
Prerequisites

Make sure you have:

Java JDK installed
MySQL installed
Eclipse IDE installed
MySQL JDBC Driver
Steps
Clone this repository.
git clone https://github.com/Chhavi-28/HospitalityManagementSystem.git
Open the project in Eclipse IDE.
Create the required MySQL database and tables.
Configure your database credentials in:
DatabaseConnector.java
Add the required MySQL JDBC Driver to the project.
Run:
HospitalityGUI.java
🖥️ Application Interface

The application provides interfaces for:

Adding Hotels
Adding Rooms
Adding Guests
Adding Reservations
Viewing stored data
🏗️ Architecture

The project follows a simple layered structure:

DAO → Handles database operations
Entity → Represents application data
Database → Handles database connectivity
GUI → Provides the desktop user interface
🔮 Future Improvements
User authentication
Role-based access control
Search and filtering
Improved UI/UX
Billing and payment management
Report generation
👩‍💻 Author

Chhavi Nagariya

B.Tech CSE Student
