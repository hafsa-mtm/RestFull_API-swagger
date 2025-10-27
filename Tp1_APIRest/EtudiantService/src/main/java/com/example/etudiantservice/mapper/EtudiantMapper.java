package com.example.etudiantservice.mapper;

import com.example.etudiantservice.dto.EtudiantRequestDTO;
import com.example.etudiantservice.dto.EtudiantResponseDTO;
import com.example.etudiantservice.entities.Etudiant;
import org.springframework.stereotype.Component;

@Component
public class EtudiantMapper {

    public EtudiantResponseDTO toResponseDTO(Etudiant etudiant) {
        if (etudiant == null) {
            return null;
        }
        return new EtudiantResponseDTO(
                etudiant.getIdEtudiant(),
                etudiant.getNom(),
                etudiant.getPrenom(),
                etudiant.getCne(),
                etudiant.getFiliereId()
        );
    }

    public Etudiant toEntity(EtudiantRequestDTO etudiantRequestDTO) {
        if (etudiantRequestDTO == null) {
            return null;
        }
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(etudiantRequestDTO.getNom());
        etudiant.setPrenom(etudiantRequestDTO.getPrenom());
        etudiant.setCne(etudiantRequestDTO.getCne());
        etudiant.setFiliereId(etudiantRequestDTO.getFiliereId());
        return etudiant;
    }

    public void updateEntityFromDTO(EtudiantRequestDTO etudiantRequestDTO, Etudiant etudiant) {
        if (etudiantRequestDTO != null) {
            etudiant.setNom(etudiantRequestDTO.getNom());
            etudiant.setPrenom(etudiantRequestDTO.getPrenom());
            etudiant.setCne(etudiantRequestDTO.getCne());
            etudiant.setFiliereId(etudiantRequestDTO.getFiliereId());
        }
    }
}