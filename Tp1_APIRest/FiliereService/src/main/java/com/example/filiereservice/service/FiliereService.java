package com.example.filiereservice.service;

import com.example.filiereservice.dto.FiliereRequestDTO;
import com.example.filiereservice.dto.FiliereResponseDTO;
import com.example.filiereservice.entities.Filiere;
import com.example.filiereservice.mapper.FiliereMapper;
import com.example.filiereservice.repo.FiliereRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FiliereService {

    @Autowired
    private FiliereRepo filiereRepo;

    @Autowired
    private FiliereMapper filiereMapper;

    // Get all filieres
    public List<FiliereResponseDTO> getAllFilieres() {
        return filiereRepo.findAll()
                .stream()
                .map(filiereMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    // Get filiere by ID
    public FiliereResponseDTO getFiliereById(int id) {
        Filiere filiere = filiereRepo.findById(id).orElse(null);
        return filiere != null ? filiereMapper.toResponseDTO(filiere) : null;
    }

    // Add new filiere
    public FiliereResponseDTO addFiliere(FiliereRequestDTO filiereRequestDTO) {
        Filiere filiere = filiereMapper.toEntity(filiereRequestDTO);
        Filiere savedFiliere = filiereRepo.save(filiere);
        return filiereMapper.toResponseDTO(savedFiliere);
    }

    // Update filiere
    public FiliereResponseDTO updateFiliere(int id, FiliereRequestDTO filiereRequestDTO) {
        Filiere existingFiliere = filiereRepo.findById(id).orElse(null);
        if (existingFiliere != null) {
            filiereMapper.updateEntityFromDTO(filiereRequestDTO, existingFiliere);
            Filiere updatedFiliere = filiereRepo.save(existingFiliere);
            return filiereMapper.toResponseDTO(updatedFiliere);
        }
        return null;
    }

    // Delete filiere by ID
    public void deleteFiliere(int id) {
        filiereRepo.deleteById(id);
    }
}