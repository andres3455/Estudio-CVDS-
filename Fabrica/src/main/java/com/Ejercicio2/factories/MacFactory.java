package com.Ejercicio2.factories;

import org.springframework.stereotype.Component;

import com.Ejercicio2.productos.Button;
import com.Ejercicio2.productos.MacButton;
import com.Ejercicio2.productos.MacTextField;
import com.Ejercicio2.productos.textField;

@Component
public class MacFactory implements GUIFactory{

    @Override
    public Button CreateButton() {
       return new MacButton();
    }

    @Override
    public textField creaTextField(){
       return new MacTextField();
    }
 
}