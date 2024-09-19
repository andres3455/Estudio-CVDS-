package com.Ejercicio2.factories;


import org.springframework.stereotype.Component;

import com.Ejercicio2.productos.*;
@Component
public class windowsFacotry implements GUIFactory{

    @Override
    public Button CreateButton() {
        return new WindowsButton();

    }


    @Override
    public textField creaTextField(){
        return new WindowsTextFiel();
    }
    
}