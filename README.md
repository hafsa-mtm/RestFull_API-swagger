# RestFull_API-swagger

## Project 1: SomeService - Simple Calculator API
### Project Overview

  Objective: Develop a simple RESTful API that allows users to submit two numbers and receive their sum
  
  Technology Stack: Spring Boot 3.5.7, Java 21, Maven, Lombok, Spring Web, Swagger
  
### 1. Project Creation

  Created Spring Boot project using Spring Initializr
  
  Included dependencies: Spring Web, Spring Data JPA, Lombok, SpringDoc OpenAPI
  
### 2. Package: entities

   Class: Nombres.java
   
   Purpose: Data model containing two variables a and b
   
   Features: Uses Lombok annotations for automatic getters, setters, and constructors
   
### 3. Package: service

   Class: CalculService.java
   
   Method: add(Nombres nombres)
   
   Functionality: Business logic to calculate sum of two numbers
   
### 4. Package: controller

   Class: CalculController.java
   
   Annotations:
   
  @RestController: Indicates REST controller with automatic JSON conversion
   
  @RequestMapping("/api/v1/calcul"): Defines base URL
  
  @Autowired: Injects service dependency
  
  @PostMapping("/somme"): Creates POST endpoint
  
### API Endpoint

   POST /api/v1/calcul/somme
### Testing with Postman

<img width="897" height="431" alt="image" src="https://github.com/user-attachments/assets/d3ce544e-9356-4631-8f42-02081d240f4a" />

## Project 2: BancService - Bank Account Management
### Project Overview

  Objective: Develop a microservice for bank account management with CRUD operations, credit, and debit functionality

  Technology Stack: Spring Boot 3.5.7, Java 21, MySQL, Spring Data JPA, Lombok, Swagger
Project Structure & Implementation

### 1. Project Creation
  Created Spring Boot project using Spring Initializr

  Included dependencies: Spring Web, Spring Data JPA, MySQL, Lombok, SpringDoc OpenAPI

### 2. Package: entities
  Class: Compte.java

  Purpose: Bank account entity with id, name, phone, and balance

  Annotations: JPA (@Entity, @Id) + Lombok for data mapping

### 3. Package: dto
  RequestCompteDto: For account creation/modification (name, phone, balance)

  ResponseCompteDto: For API responses (id, name, phone, balance)
  
### 4. Package: mapper
  Class: CompteMapper.java

  Functionality: Converts between Entity and DTO using BeanUtils

### 5. Package: repository
  Interface: CompteRepository.java

  Features: JpaRepository providing automatic CRUD operations

### 6. Package: service
  Interface: CompteService.java - Defines 7 methods

  Implementation: CompteServiceImpl.java - Business logic with DTO/Entity conversion

### 7. Package: controller
  Class: ApiRestful.java

  Endpoints: 7 REST endpoints with OpenAPI documentation

### API Endpoints
  #### GET /api/comptes

   Description: Get all bank accounts

   Response: List of all accounts with details
   
  #### GET /api/comptes/{id}

   Description: Get specific account by ID

   Parameters: Account ID as path variable

   Response: Account details (id, nom, tel, solde)

  #### POST /api/comptes

   Description: Create a new bank account

   Request Body: JSON with nom, tel, solde

   Response: Created account details with generated ID

  #### PUT /api/comptes/{id}

   Description: Update an existing account

   Parameters: Account ID as path variable

   Request Body: JSON with updated nom, tel, solde

   Response: Updated account details

  #### DELETE /api/comptes/{id}
  
   Description: Delete a bank account

   Parameters: Account ID as path variable

   Response: Success confirmation

  #### PATCH /api/comptes/{id}/crediter

   Description: Credit money to an account

   Parameters: Account ID as path variable, montant as request parameter

   Response: Updated account balance

 #### PATCH /api/comptes/{id}/debiter

   Description: Debit money from an account

   Parameters: Account ID as path variable, montant as request parameter

   Response: Updated account balance

### Testing with Postman

1. Get All Accounts
   
   <img width="586" height="564" alt="image" src="https://github.com/user-attachments/assets/137c9c37-c083-454c-a26f-36b9fe3c2cca" />

3. Get Account by ID

  <img width="568" height="423" alt="image" src="https://github.com/user-attachments/assets/fd8b0a62-8570-4f49-a7e9-93e7119cf890" />

5. Create New Account

   <img width="554" height="446" alt="image" src="https://github.com/user-attachments/assets/0b5a6cba-c921-420b-9000-63216da61619" />
   
8. Update Account

   <img width="458" height="431" alt="image" src="https://github.com/user-attachments/assets/8544e472-be9b-45e4-b7f8-0bd0c20fd117" />
   
10. Delete Account

    <img width="541" height="384" alt="image" src="https://github.com/user-attachments/assets/3b314047-d719-457a-a04d-87d2a479968f" />

    <img width="468" height="501" alt="image" src="https://github.com/user-attachments/assets/e40fbe1f-4c99-4cd8-a9fe-e01a605131b6" />
    
12. Credit Account

    <img width="625" height="341" alt="image" src="https://github.com/user-attachments/assets/2564a5d2-085b-4a5b-aeb9-be1c7709cf43" />
    
14. Debit Account

    <img width="656" height="376" alt="image" src="https://github.com/user-attachments/assets/1cee3ac7-25cd-4e9c-8e8d-5d6dafc56875" />
   
### Swagger Documentation

1.Access Swagger UI:

   <img width="888" height="464" alt="image" src="https://github.com/user-attachments/assets/a613d9df-d647-4e86-95a4-3bae6a1800c3" />

2.Get by Id 

  <img width="945" height="320" alt="image" src="https://github.com/user-attachments/assets/4d4f369c-f724-41bf-8c7d-e1fb8d3c456c" />

  <img width="945" height="474" alt="image" src="https://github.com/user-attachments/assets/a857cfd7-cae9-4a4e-8f08-44839e03279d" />

4.get all the list 

  <img width="945" height="271" alt="image" src="https://github.com/user-attachments/assets/40e45d63-5208-41b5-be14-7bdf5fa6e14a" />

  <img width="945" height="484" alt="image" src="https://github.com/user-attachments/assets/45dceae8-592a-49f8-adaf-4b906dd4d582" />

