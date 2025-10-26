package com.example.project1.Service;

import com.example.project1.entities.Nombres;
import org.springframework.stereotype.Service;

@Service
public class CalculService {

    public double add(Nombres nombres) {
        return nombres.getA() + nombres.getB();
    }
}
