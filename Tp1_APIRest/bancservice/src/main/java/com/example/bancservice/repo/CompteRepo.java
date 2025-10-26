package com.example.bancservice.repo;

import com.example.bancservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepo extends JpaRepository<Compte, Integer> {


}