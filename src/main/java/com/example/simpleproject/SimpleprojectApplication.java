package com.example.simpleproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.applet.AppletContext;
import java.util.Arrays;

@SpringBootApplication
public class SimpleprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleprojectApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext aptctx){
        return args -> {
            System.out.println("Let's inspect spring boot application");
            String[] beanNames = aptctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String definition:beanNames){
                System.out.println(definition);
            }
        };
    }
}
