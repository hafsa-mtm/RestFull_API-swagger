
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
  1.GET /api/comptes

   Description: Get all bank accounts

   Response: List of all accounts with details
   
  2.GET /api/comptes/{id}

   Description: Get specific account by ID

   Parameters: Account ID as path variable

   Response: Account details (id, nom, tel, solde)

  3. POST /api/comptes

   Description: Create a new bank account

   Request Body: JSON with nom, tel, solde

   Response: Created account details with generated ID

  4.PUT /api/comptes/{id}

   Description: Update an existing account

   Parameters: Account ID as path variable

   Request Body: JSON with updated nom, tel, solde

   Response: Updated account details

  5.DELETE /api/comptes/{id}
  
   Description: Delete a bank account

   Parameters: Account ID as path variable

   Response: Success confirmation

  6. PATCH /api/comptes/{id}/crediter

   Description: Credit money to an account

   Parameters: Account ID as path variable, montant as request parameter

   Response: Updated account balance

 7.PATCH /api/comptes/{id}/debiter

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

## Project 3: Faculty Management - Microservices with One-To-Many Relationship
 ### Project Overview
 
  Objective: Implement two microservices for managing faculties and students with one-to-many relationship and inter-service communication

  Architecture: Two independent Spring Boot applications with separate MySQL databases

  Technology Stack: Spring Boot 3.5.7, Java 21, MySQL, Spring Data JPA, RestTemplate, Lombok, Swagger

#### Microservice 1: FiliereService

  ##### Project Structure & Implementation
  
   1. Package: entities
      Class: Filiere.java
  
      Fields: idFiliere, code, libelle

      Annotations: JPA @Entity, @Id for database mapping
  
  2. Package: repository
      Interface: FiliereRepository.java

      Features: Extends JpaRepository for automatic CRUD operations

  3. Package: service
      Class: FiliereService.java

      Methods: save(), findAll(), update(), deleteById()

      Functionality: Business logic and data persistence

  4. Package: controller
      Class: FiliereController.java

#### Annotations: REST endpoints with Swagger documentation

  ##### FiliereService API Endpoints

  1.GET /api/v1/filieres

   Description: Get all academic programs

   Response: List of all filieres with details

  2.GET /api/v1/filieres/{id}

   Description: Get specific filiere by ID

   Parameters: Filiere ID as path variable

   Response: Filiere details (idFiliere, code, libelle)

  3.POST /api/v1/filieres

   Description: Create a new academic program

   Request Body: JSON with code and libelle

   Response: Created filiere details with generated ID

  4.PUT /api/v1/filieres/{id}

   Description: Update an existing filiere

   Parameters: Filiere ID as path variable

   Request Body: JSON with updated code and libelle

   Response: Updated filiere details

 5.DELETE /api/v1/filieres/{id}

   Description: Delete an academic program

   Parameters: Filiere ID as path variable

   Response: Success confirmation

#### Microservice 2: EtudiantService
 #### Project Structure & Implementation
 
  1. Package: entities
     
   Class: Etudiant.java

   Fields: idEtudiant, nom, prenom, cne, filiereId

   Annotations: JPA @Entity, @Id with relationship mapping

2. Package: repository
  Interface: EtudiantRepository.java

  Features: Extends JpaRepository for automatic CRUD operations

3. Package: service
   Class: EtudiantService.java

   Functionality: Business logic for student management

4. Package: config
   Class: RestConfig.java

   Bean: RestTemplate for HTTP communication between microservices

5. Package: controller
   Class: EtudiantController.java

   Features: REST endpoints with inter-service communication

##### EtudiantService API Endpoints
  1.GET /api/v1/etudiants

   Description: Get all students

   Response: List of all students with details

  2.GET /api/v1/etudiants/{id}

   Description: Get specific student by ID

   Parameters: Student ID as path variable

   Response: Student details with filiere information

  3.POST /api/v1/etudiants

   Description: Create a new student

  Request Body: JSON with nom, prenom, cne, filiereId

  Response: Created student details with generated ID

 4.PUT /api/v1/etudiants

  Description: Update an existing student

  Request Body: JSON with updated student information

  Response: Updated student details

5.DELETE /api/v1/etudiants/{id}

  Description: Delete a student
 
  Parameters: Student ID as path variable

  Response: Success confirmation

##### Testing with Postman

##### FiliereService Tests:

GET http://localhost:8081/api/v1/filieres

<img width="552" height="371" alt="image" src="https://github.com/user-attachments/assets/1c9e0bbb-e97e-4b06-9932-202f3f163f1f" />

GET http://localhost:8081/api/v1/filieres/1

<img width="563" height="415" alt="image" src="https://github.com/user-attachments/assets/34a4e794-9af4-4486-9ecf-6b8e73b1a04e" />

POST http://localhost:8081/api/v1/filieres

<img width="548" height="383" alt="image" src="https://github.com/user-attachments/assets/1164ed5f-ae64-40b9-a7f6-9a20ced7d6d8" />

PUT http://localhost:8081/api/v1/filieres/1

<img width="496" height="471" alt="image" src="https://github.com/user-attachments/assets/f5fa5337-f60f-4c58-96c5-2d3690f0640c" />

DELETE http://localhost:8081/api/v1/filieres/1

<img width="503" height="316" alt="image" src="https://github.com/user-attachments/assets/1c41588b-33eb-4a25-916c-2106906b8c21" />

<img width="596" height="498" alt="image" src="https://github.com/user-attachments/assets/12c8b86a-942f-4e4a-a770-8c08f3cdb1ce" />

##### EtudianteService Tests:

GET http://localhost:8082/api/v1/etudiants

<img width="365" height="428" alt="image" src="https://github.com/user-attachments/assets/d4a60d65-8ccb-4964-93fd-ebf116d507e4" />

POST http://localhost:8082/api/v1/etudiants

<img width="593" height="454" alt="image" src="https://github.com/user-attachments/assets/ea013fb5-eaa0-4551-800e-f15e44d124d5" />

GET http://localhost:8082/api/v1/etudiants/1

<img width="526" height="373" alt="image" src="https://github.com/user-attachments/assets/3665e770-c722-4842-b798-a90ee15a1d5f" />

PUT http://localhost:8082/api/v1/etudiants

<img width="504" height="388" alt="image" src="https://github.com/user-attachments/assets/01d6ea37-52cb-4cba-9393-d7777976cf31" />

DELETE http://localhost:8082/api/v1/etudiants/1

<img width="663" height="310" alt="image" src="https://github.com/user-attachments/assets/e6ebd749-b684-4684-80a1-8ede2405cada" />

<img width="486" height="549" alt="image" src="https://github.com/user-attachments/assets/717bfa4a-5eb6-48e7-8815-4c44d868abf1" />

#### Swagger Documentation
Access Swagger UI:
FiliereService: http://localhost:8081/swagger-ui.html

<img width="945" height="303" alt="image" src="https://github.com/user-attachments/assets/7a256aae-c875-46cd-883e-e267a551ed10" />

<img width="945" height="289" alt="image" src="https://github.com/user-attachments/assets/eab6bbad-f5c2-47a7-bc42-2e4ffe2e9454" />

1.Get By id 

<img width="945" height="359" alt="image" src="https://github.com/user-attachments/assets/1f6355b9-e970-4c29-a03e-4ee692325417" />

<img width="945" height="296" alt="image" src="https://github.com/user-attachments/assets/a197c5db-c175-4e85-b2ee-a7b736031340" />

2.Put 

<img width="945" height="382" alt="image" src="https://github.com/user-attachments/assets/878c9f32-600e-44ff-b39f-4717cbe88969" />

<img width="945" height="420" alt="image" src="https://github.com/user-attachments/assets/85ad07be-1da7-4ad9-97eb-55cdf8cd5d02" />

4.Get the list 

<img width="945" height="420" alt="image" src="https://github.com/user-attachments/assets/793115c1-06fe-4933-966e-6c0f8445721c" />

<img width="945" height="351" alt="image" src="https://github.com/user-attachments/assets/31eb26b7-ed2f-49fb-a69c-b8da59ce7a4a" />

5.post

<img width="945" height="437" alt="image" src="https://github.com/user-attachments/assets/31ecbef8-c4b8-4e1d-be83-ed8d4b53a2f3" />

6.delete 

<img width="945" height="284" alt="image" src="https://github.com/user-attachments/assets/8513f6ee-be22-488f-939e-ced6e8b7a173" />

<img width="945" height="343" alt="image" src="https://github.com/user-attachments/assets/1ba1d8a7-c6a7-4eee-b7de-5704eba2a854" />

EtudiantService: http://localhost:8082/swagger-ui.html

<img width="945" height="265" alt="image" src="https://github.com/user-attachments/assets/3963c34e-d425-4af4-88db-aa977d534e1c" />

<img width="945" height="363" alt="image" src="https://github.com/user-attachments/assets/7c22ddf6-119f-49e3-891e-a301cb94a8e8" />

1.delete

<img width="945" height="311" alt="image" src="https://github.com/user-attachments/assets/feda3e0d-5166-4c00-8371-61727984ee52" />

<img width="945" height="331" alt="image" src="https://github.com/user-attachments/assets/38a2051d-ec3b-4d38-9f0d-8f0ffcb3b2fe" />

2.get all 

<img width="945" height="318" alt="image" src="https://github.com/user-attachments/assets/2b134818-9e6f-462b-b6fb-d4bda72ddfcd" />

<img width="945" height="399" alt="image" src="https://github.com/user-attachments/assets/85750d18-5bc1-4146-8f59-d3bd669e8842" />

3.Get by id 

<img width="945" height="374" alt="image" src="https://github.com/user-attachments/assets/6ba21b6f-627a-46a3-8caf-d13fad5d116c" />

<img width="945" height="345" alt="image" src="https://github.com/user-attachments/assets/f157da68-4d6a-4c99-a878-0749ab5de84c" />

4.Put

<img width="945" height="346" alt="image" src="https://github.com/user-attachments/assets/a04b7194-1d24-4c7d-a330-d368eeabeb1a" />

<img width="945" height="362" alt="image" src="https://github.com/user-attachments/assets/e8a38f31-5c0d-4b86-9efa-6c3030737046" />

