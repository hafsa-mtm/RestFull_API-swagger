package com.example.etudiantservice.controller;

import com.example.etudiantservice.entities.Etudiant;
import com.example.etudiantservice.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.create(etudiant);
    }

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable int id) {
        return etudiantService.getById(id);
    }

    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.update(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id) {
        etudiantService.deleteById(id);
    }
}
