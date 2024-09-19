package com.Ejercicio2.factories;

import com.Ejercicio2.productos.*;

public class windowsFacotry implements GUIFactory{

    @Override
    public Button CreateButton() {
        return new WindowsButton();

    }


    @Override
    public TextField creaTextField() {
        return new WindowsTextFiel();
        }
    
}