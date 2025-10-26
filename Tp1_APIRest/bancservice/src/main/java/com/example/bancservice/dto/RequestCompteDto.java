package com.example.bancservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestCompteDto {
    private String nom;
    private String tel;
    private double solde;
}
