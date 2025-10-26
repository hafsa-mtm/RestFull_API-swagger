package com.example.bancservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseCompteDto {
    private Integer id;
    private String nom;
    private String tel;
    private double solde;

}
