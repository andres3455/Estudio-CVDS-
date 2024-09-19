package com.Ejercicio2.factories;

import com.Ejercicio2.productos.Button;
import com.Ejercicio2.productos.MacButton;
import com.Ejercicio2.productos.MacTextField;
import com.Ejercicio2.productos.TextField;

public class MacFactory implements GUIFactory{

    @Override
    public Button CreateButton() {
       return new MacButton();
    }

    @Override
    public TextField creaTextField() {
       return new MacTextField();
    }
 
}