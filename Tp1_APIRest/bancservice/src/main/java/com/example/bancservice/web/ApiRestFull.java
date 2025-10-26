package com.example.bancservice.web;

import com.example.bancservice.dto.RequestCompteDto;
import com.example.bancservice.dto.ResponseCompteDto;
import com.example.bancservice.services.CompteService;
import com.example.bancservice.services.CompteServiceImpl;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/compte")
public class ApiRestFull {
    private CompteServiceImpl compteService;
    public ajt(CompteServiceImpl comteservice){
        this.compteService = comteservice;
    }

}
