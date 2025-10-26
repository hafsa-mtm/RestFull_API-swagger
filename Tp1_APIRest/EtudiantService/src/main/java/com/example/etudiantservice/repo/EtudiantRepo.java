package com.example.etudiantservice.repo;

import com.example.etudiantservice.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {
}
