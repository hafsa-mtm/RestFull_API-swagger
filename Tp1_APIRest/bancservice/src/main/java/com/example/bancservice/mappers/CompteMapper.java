package com.example.bancservice.mappers;


import com.example.bancservice.dto.RequestCompteDto;
import com.example.bancservice.dto.ResponseCompteDto;
import com.example.bancservice.entities.Compte;
import org.springframework.beans.BeanUtils;

public class CompteMapper {

    public Compte Dto_to_entity(RequestCompteDto requestCompteDto){
        Compte compte = new Compte();
        BeanUtils.copyProperties(requestCompteDto,compte);
        return  compte;

    }
    public RequestCompteDto entity_to_Dto(Compte compte){
        ResponseCompteDto responseCompteDto = new ResponseCompteDto();
        BeanUtils.copyProperties(compte, responseCompteDto);
        return ;
    }

}
