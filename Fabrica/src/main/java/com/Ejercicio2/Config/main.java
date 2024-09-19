package com.Ejercicio2.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Ejercicio2.App;

public class main {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        App app = context.getBean(App.class);
        
        app.renderUI();

    }
}
