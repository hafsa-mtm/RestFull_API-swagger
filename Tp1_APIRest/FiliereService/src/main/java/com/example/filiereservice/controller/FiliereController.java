package com.example.filiereservice.controller;

import com.example.filiereservice.entities.Filiere;
import com.example.filiereservice.service.FiliereService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/filieres")
@Tag(name = "Filiere Management", description = "APIs for managing academic programs (Filieres)")
public class FiliereController {

    @Autowired
    private FiliereService filiereService;

    @GetMapping
    @Operation(summary = "Get all filieres", description = "Retrieve a list of all academic programs")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of filieres")
    public List<Filiere> getAllFilieres() {
        return filiereService.getAllFilieres();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get filiere by ID", description = "Retrieve a specific filiere by its ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filiere found"),
            @ApiResponse(responseCode = "404", description = "Filiere not found")
    })
    public Filiere getFiliereById(
            @Parameter(description = "ID of the filiere to retrieve", example = "1")
            @PathVariable int id) {
        return filiereService.getFiliereById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new filiere", description = "Add a new academic program to the system")
    @ApiResponse(responseCode = "200", description = "Filiere created successfully")
    public Filiere addFiliere(
            @Parameter(description = "Filiere object to create")
            @RequestBody Filiere filiere) {
        return filiereService.addFiliere(filiere);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a filiere", description = "Update an existing academic program")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filiere updated successfully"),
            @ApiResponse(responseCode = "404", description = "Filiere not found")
    })
    public Filiere updateFiliere(
            @Parameter(description = "ID of the filiere to update", example = "1")
            @PathVariable int id,
            @Parameter(description = "Updated filiere object")
            @RequestBody Filiere filiere) {
        filiere.setIdFiliere(id);
        return filiereService.updateFiliere(filiere);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a filiere", description = "Remove an academic program from the system")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filiere deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Filiere not found")
    })
    public void deleteFiliere(
            @Parameter(description = "ID of the filiere to delete", example = "1")
            @PathVariable int id) {
        filiereService.deleteFiliere(id);
    }
}