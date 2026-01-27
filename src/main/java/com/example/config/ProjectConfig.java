package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // Indication for the spring class that I have done some changes to create some beans
//IoC container will scan all the content of the class
//Bhai dekh ye btaega ki yaha par @Bean ki definition method likha hua hai taaki isko spring container process kare auur beans create karne me help milegi
@ComponentScan(basePackages = "com.example.beans") //Bhai ye component bnn jaega beans ka isme @Beans annotation use karne ki jroort ni pdegi

public class ProjectConfig {
}
