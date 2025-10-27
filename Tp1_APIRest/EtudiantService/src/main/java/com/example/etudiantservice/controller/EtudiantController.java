package com.example.etudiantservice.controller;

import com.example.etudiantservice.dto.EtudiantRequestDTO;
import com.example.etudiantservice.dto.EtudiantResponseDTO;
import com.example.etudiantservice.service.EtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/etudiants")
@Tag(name = "Student Management", description = "APIs for managing students with Filiere relationship")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping
    @Operation(summary = "Create a new student", description = "Add a new student with filiere relationship")
    @ApiResponse(responseCode = "201", description = "Student created successfully")
    public ResponseEntity<EtudiantResponseDTO> createEtudiant(
            @Parameter(description = "Student data to create")
            @RequestBody EtudiantRequestDTO etudiantRequestDTO) {
        EtudiantResponseDTO createdEtudiant = etudiantService.create(etudiantRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEtudiant);
    }

    @GetMapping
    @Operation(summary = "Get all students", description = "Retrieve a list of all students")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of students")
    public ResponseEntity<List<EtudiantResponseDTO>> getAllEtudiants() {
        List<EtudiantResponseDTO> etudiants = etudiantService.getAll();
        return ResponseEntity.ok(etudiants);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get student by ID", description = "Retrieve a specific student by its ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Student found"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public ResponseEntity<EtudiantResponseDTO> getEtudiantById(
            @Parameter(description = "ID of the student to retrieve", example = "1")
            @PathVariable int id) {
        EtudiantResponseDTO etudiant = etudiantService.getById(id);
        return etudiant != null ? ResponseEntity.ok(etudiant) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a student", description = "Update an existing student's information")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Student updated successfully"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public ResponseEntity<EtudiantResponseDTO> updateEtudiant(
            @Parameter(description = "ID of the student to update", example = "1")
            @PathVariable int id,
            @Parameter(description = "Updated student data")
            @RequestBody EtudiantRequestDTO etudiantRequestDTO) {
        EtudiantResponseDTO updatedEtudiant = etudiantService.update(id, etudiantRequestDTO);
        return updatedEtudiant != null ? ResponseEntity.ok(updatedEtudiant) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a student", description = "Remove a student from the system")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Student deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public ResponseEntity<Void> deleteEtudiant(
            @Parameter(description = "ID of the student to delete", example = "1")
            @PathVariable int id) {
        etudiantService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}