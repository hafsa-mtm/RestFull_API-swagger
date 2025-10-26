package com.example.etudiantservice.service;

import com.example.etudiantservice.entities.Etudiant;
import com.example.etudiantservice.repo.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepo etudiantRepo;
    public Etudiant create(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }
    public List<Etudiant> getAll() {
        return etudiantRepo.findAll();
    }
    public Optional<Etudiant> getById(int id){
        return etudiantRepo.findById(id);
    }
    public Etudiant update(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }
    public void deleteById(int id) {
        etudiantRepo.deleteById(id);
    }
    }
