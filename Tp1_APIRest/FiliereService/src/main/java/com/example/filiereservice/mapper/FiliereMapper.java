package com.example.filiereservice.mapper;

import com.example.filiereservice.dto.FiliereRequestDTO;
import com.example.filiereservice.dto.FiliereResponseDTO;
import com.example.filiereservice.entities.Filiere;
import org.springframework.stereotype.Component;

@Component
public class FiliereMapper {

    public FiliereResponseDTO toResponseDTO(Filiere filiere) {
        if (filiere == null) {
            return null;
        }
        return new FiliereResponseDTO(
                filiere.getIdFiliere(),
                filiere.getCode(),
                filiere.getLibelle()
        );
    }

    public Filiere toEntity(FiliereRequestDTO filiereRequestDTO) {
        if (filiereRequestDTO == null) {
            return null;
        }
        Filiere filiere = new Filiere();
        filiere.setCode(filiereRequestDTO.getCode());
        filiere.setLibelle(filiereRequestDTO.getLibelle());
        return filiere;
    }

    public void updateEntityFromDTO(FiliereRequestDTO filiereRequestDTO, Filiere filiere) {
        if (filiereRequestDTO != null) {
            filiere.setCode(filiereRequestDTO.getCode());
            filiere.setLibelle(filiereRequestDTO.getLibelle());
        }
    }
}
