package com.example.etudiantservice.controller;

import com.example.etudiantservice.entities.Etudiant;
import com.example.etudiantservice.service.EtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/etudiants")
@Tag(name = "Student Management", description = "APIs for managing students with Filiere relationship")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping
    @Operation(summary = "Create a new student", description = "Add a new student with filiere relationship")
    @ApiResponse(responseCode = "200", description = "Student created successfully")
    public Etudiant createEtudiant(
            @Parameter(description = "Student object to create")
            @RequestBody Etudiant etudiant) {
        return etudiantService.create(etudiant);
    }

    @GetMapping
    @Operation(summary = "Get all students", description = "Retrieve a list of all students")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of students")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get student by ID", description = "Retrieve a specific student by its ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Student found"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public Optional<Etudiant> getEtudiantById(
            @Parameter(description = "ID of the student to retrieve", example = "1")
            @PathVariable int id) {
        return etudiantService.getById(id);
    }

    @PutMapping
    @Operation(summary = "Update a student", description = "Update an existing student's information")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Student updated successfully"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public Etudiant updateEtudiant(
            @Parameter(description = "Updated student object")
            @RequestBody Etudiant etudiant) {
        return etudiantService.update(etudiant);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a student", description = "Remove a student from the system")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Student deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public void deleteEtudiant(
            @Parameter(description = "ID of the student to delete", example = "1")
            @PathVariable int id) {
        etudiantService.deleteById(id);
    }
}