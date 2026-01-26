package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Maruti 800");
        System.out.println("Vehicle name from non spring context is " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // Upar wali line hi bhai IoC container ko intialise karne ke liye responsible hai
        // please consider all the config inside th ProjectConfig class

        Vehicle vehh = context.getBean(Vehicle.class);
        // getBean takes the param as to data type kya hai jo bean chahiye uska
        System.out.println("Vehicle from beans " + vehh.getName());
    }

}
