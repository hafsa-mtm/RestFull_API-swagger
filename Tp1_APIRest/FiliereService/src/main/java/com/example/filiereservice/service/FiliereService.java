package com.example.filiereservice.service;

import com.example.filiereservice.entities.Filiere;
import com.example.filiereservice.repo.FiliereRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereService {

    @Autowired
    private FiliereRepo filiereRepo;

    // Récupérer toutes les filières
    public List<Filiere> getAllFilieres() {
        return filiereRepo.findAll();
    }

    // ADD JUST THIS ONE METHOD - Récupérer une filière par ID
    public Filiere getFiliereById(int id) {
        return filiereRepo.findById(id).orElse(null);
    }

    // Ajouter une nouvelle filière
    public Filiere addFiliere(Filiere filiere) {
        return filiereRepo.save(filiere);
    }

    public Filiere updateFiliere(Filiere filiere) {
        return filiereRepo.save(filiere);
    }

    // Supprimer une filière par ID
    public void deleteFiliere(int id) {
        filiereRepo.deleteById(id);
    }
}