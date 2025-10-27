package com.example.etudiantservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantRequestDTO {
    private String nom;
    private String prenom;
    private String cne;
    private int filiereId;
}