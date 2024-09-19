package com.Ejercicio2.factories;
import com.Ejercicio2.productos.Button;
import com.Ejercicio2.productos.TextField;


public interface GUIFactory {

    Button CreateButton();
    TextField creaTextField();
}