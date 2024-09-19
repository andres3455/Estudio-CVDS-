package com.ejemplo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    private Motor motor;

    @Autowired
    public Coche(Motor motor){
        this.motor = motor;
    }
    
    public void arrancar (){
        motor.Encender();
    }
}