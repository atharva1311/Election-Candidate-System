# Election Candidate Management System  

## Description  
This project is a menu-driven system for managing election candidates and parties. It uses JDBC to fetch and manipulate data and is designed with a modular architecture to ensure clean, maintainable, and scalable code. Maven is utilized for dependency management and build automation.

## Features  
- View all candidates.  
- View candidates party-wise.  
- View all parties.  
- Filter candidates based on age and gender.  
- Modular design with five distinct layers:  
  - **Entity**: Candidate POJO class.  
  - **DAO**: Manages data retrieval and persistence using JDBC.  
  - **Service**: Implements project business logic.  
  - **Controller**: Handles interactions between the service layer and the client.  
  - **Client**: Contains the main method with a user-friendly menu.  

## Technologies Used  
- **Programming Language**: Java  
- **Database Connectivity**: JDBC  
- **Build Tool**: Maven  

## Installation  
1. Clone the repository:  
   ```bash
   git clone <repository-url>
