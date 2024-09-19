package com.ejemplo.app;

import org.springframework.stereotype.Component;

@Component
public class Combustion implements Motor{

    @Override
    public void Encender() {
        System.out.println("Encender motor a combustion");
        }

}