package com.ejemplo.app;
import org.springframework.stereotype.Component;


public class Electrico implements Motor{

    @Override
    public void Encender() {
        System.out.println("Encender Motor Electrico");
    }
}

