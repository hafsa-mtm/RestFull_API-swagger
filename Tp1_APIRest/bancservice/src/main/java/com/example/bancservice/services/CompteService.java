package com.example.bancservice.services;

import com.example.bancservice.dto.RequestCompteDto;
import com.example.bancservice.dto.ResponseCompteDto;
import com.example.bancservice.entities.Compte;

import java.util.List;

public interface CompteService {
    public ResponseCompteDto AddCompte(RequestCompteDto requestCompteDto);
    public ResponseCompteDto updateCompte(Integer id, RequestCompteDto requestCompteDto);
    public void deleteCompte(Integer id);
    public ResponseCompteDto Debiter(Integer id);

}
