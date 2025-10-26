package com.example.bancservice.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Compte {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String nom;
   private String tel;
   private double solde;
}
