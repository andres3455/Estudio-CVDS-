package com.Ejercicio2;

import com.Ejercicio2.factories.GUIFactory;
import com.Ejercicio2.factories.MacFactory;
import com.Ejercicio2.factories.windowsFacotry;
import com.Ejercicio2.productos.Button;
import com.Ejercicio2.productos.TextField;

/**
 * Hello world!
 *
 */
public class App{
    private Button button;
    private TextField text;
    
    public App (GUIFactory factory){

        button= factory.CreateButton();
        text = factory.creaTextField();
    }
    
    public void renderUI(){
        button.paint();
        text.render();

    }

    public static void main( String[] args ){

        GUIFactory factory;

        String os = "Mac";

        if (os.equals("Windows")){
            factory  = new windowsFacotry();            
        } else {
            factory = new MacFactory();
        }

        App  app = new App (factory);
        app.renderUI();
    }
}
