package com.example.filiereservice.controller;

import com.example.filiereservice.entities.Filiere;
import com.example.filiereservice.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/filieres")
public class FiliereController {

    @Autowired
    private FiliereService filiereService;

    // GET → récupérer toutes les filières
    @GetMapping
    public List<Filiere> getAllFilieres() {
        return filiereService.getAllFilieres();
    }

    @GetMapping("/{id}")
    public Filiere getFiliereById(@PathVariable int id) {
        return filiereService.getFiliereById(id);
    }

    // POST → ajouter une nouvelle filière
    @PostMapping
    public Filiere addFiliere(@RequestBody Filiere filiere) {
        return filiereService.addFiliere(filiere);
    }

    // ADD THIS METHOD - PUT → modifier une filière
    @PutMapping("/{id}")
    public Filiere updateFiliere(@PathVariable int id, @RequestBody Filiere filiere) {
        filiere.setIdFiliere(id); // Now 'id' is available
        return filiereService.updateFiliere(filiere);
    }
    // DELETE → supprimer une filière par ID
    @DeleteMapping("/{id}")
    public void deleteFiliere(@PathVariable int id) {
        filiereService.deleteFiliere(id);
    }
}