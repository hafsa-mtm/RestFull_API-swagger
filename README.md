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

