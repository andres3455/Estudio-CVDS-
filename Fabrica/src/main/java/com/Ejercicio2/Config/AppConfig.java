package com.Ejercicio2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Ejercicio2.factories.*;

@Configuration
@ComponentScan
public class AppConfig{

    @Bean
    public GUIFactory factory (){

        return new MacFactory();
    }
}