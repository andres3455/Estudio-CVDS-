package com.Ejercicio2.factories;
import com.Ejercicio2.productos.Button;
import com.Ejercicio2.productos.textField;


public interface GUIFactory {

    Button CreateButton();
    textField creaTextField();
}