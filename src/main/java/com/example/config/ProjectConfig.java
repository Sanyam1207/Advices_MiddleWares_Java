package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Indication for the spring class that I have done some changes to create some beans
//IoC container will scan all the content of the class
//Bhai dekh ye btaega ki yaha par @Bean ki definition method likha hua hai taaki isko spring container process kare auur beans create karne me help milegi

public class ProjectConfig {

    @Bean
    Vehicle vehicle(){ // Bhai method ka jo name hai same jaega spring ke context ke andar vo naam
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    String hello(){
        return "Sanyam Pandey";
    }

    @Bean
    Integer number(){
        return 43;
    }

}
