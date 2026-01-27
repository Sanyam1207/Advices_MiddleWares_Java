package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.util.Random;
import java.util.function.Supplier;

public class Example3 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswaegnSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi R8");
            return audi;
        };

        Random random = new Random();
        int randInt = random.nextInt(10);
        if(randInt % 2 == 0){
            context.registerBean("voklswagen", Vehicle.class, volkswaegnSupplier);
        } else {
            context.registerBean("Audi R8", Vehicle.class, audiSupplier);
        }

        Vehicle volkswagenVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volkswagenVehicle = context.getBean("voklswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("Bhai ye na random number aya hai ye " + randInt);
        }

        try {
            audiVehicle = context.getBean("Audi R8", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("Bhai audi nahi aayi " + randInt);
        }

        System.out.println("volkswagen ka game " + volkswagenVehicle);
        System.out.println("\n\n");
        System.out.println("Audi R8 Ka game " + audiVehicle);
    }
}
