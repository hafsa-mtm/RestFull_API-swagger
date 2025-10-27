package com.example.filiereservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FiliereResponseDTO {
    private int idFiliere;
    private String code;
    private String libelle;
}