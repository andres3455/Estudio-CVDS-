package com.Ejercicio2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Ejercicio2.factories.GUIFactory;

import com.Ejercicio2.productos.Button;
import com.Ejercicio2.productos.textField;

/**
 * Hello world!
 *
 */
@Component
public class App{
    private Button button;
    private textField text;
    
    @Autowired
    public App (GUIFactory factory){

        button= factory.CreateButton();
        text = factory.creaTextField();
    }
    
    public void renderUI(){
        button.paint();
        text.render();

    }

}
