package com.example.etudiantservice.service;

import com.example.etudiantservice.dto.EtudiantRequestDTO;
import com.example.etudiantservice.dto.EtudiantResponseDTO;
import com.example.etudiantservice.entities.Etudiant;
import com.example.etudiantservice.mapper.EtudiantMapper;
import com.example.etudiantservice.repo.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepo etudiantRepo;

    @Autowired
    private EtudiantMapper etudiantMapper;

    public EtudiantResponseDTO create(EtudiantRequestDTO etudiantRequestDTO) {
        Etudiant etudiant = etudiantMapper.toEntity(etudiantRequestDTO);
        Etudiant savedEtudiant = etudiantRepo.save(etudiant);
        return etudiantMapper.toResponseDTO(savedEtudiant);
    }

    public List<EtudiantResponseDTO> getAll() {
        return etudiantRepo.findAll()
                .stream()
                .map(etudiantMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public EtudiantResponseDTO getById(int id) {
        Etudiant etudiant = etudiantRepo.findById(id).orElse(null);
        return etudiant != null ? etudiantMapper.toResponseDTO(etudiant) : null;
    }

    public EtudiantResponseDTO update(int id, EtudiantRequestDTO etudiantRequestDTO) {
        Etudiant existingEtudiant = etudiantRepo.findById(id).orElse(null);
        if (existingEtudiant != null) {
            etudiantMapper.updateEntityFromDTO(etudiantRequestDTO, existingEtudiant);
            Etudiant updatedEtudiant = etudiantRepo.save(existingEtudiant);
            return etudiantMapper.toResponseDTO(updatedEtudiant);
        }
        return null;
    }

    public void deleteById(int id) {
        etudiantRepo.deleteById(id);
    }
}