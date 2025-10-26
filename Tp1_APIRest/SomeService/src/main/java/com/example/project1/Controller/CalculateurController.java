package com.example.project1.Controller;

import com.example.project1.Service.CalculService;
import com.example.project1.entities.Nombres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calcul") // version 1 of your API
public class CalculateurController {

    @Autowired
    private CalculService calculService;

    // Endpoint to calculate sum
    @PostMapping("/somme")
    public String calculerSomme(@RequestBody Nombres nombres) {
        double result = calculService.add(nombres);
        return (int)nombres.getA() + " + " + (int)nombres.getB() + " = " + (int)result;
    }
}
