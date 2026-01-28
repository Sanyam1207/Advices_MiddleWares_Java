package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
//        Person sanyam_pandey = context.getBean("person_with_method_params", Person.class);
        System.out.println("Person bean " + person.getVehicle().getName() + "  " + person.getName());
        System.out.println(" vehicle " + vehicle.getName());
//        System.out.println("\n\n New person with method " + sanyam_pandey.getVehicle().getName() + " and name is " + sanyam_pandey.getName());
//        Vehicle volkswagen = new Vehicle();
//        volkswagen.setName("Volkswagen");
//        Supplier<Vehicle> volkswaegnSupplier = () -> volkswagen;
//
//        Supplier<Vehicle> audiSupplier = () -> {
//            Vehicle audi = new Vehicle();
//            audi.setName("Audi R8");
//            return audi;
//        };
//
//        Random random = new Random();
//        int randInt = random.nextInt(10);
//        if(randInt % 2 == 0){
//            context.registerBean("voklswagen", Vehicle.class, volkswaegnSupplier);
//        } else {
//            context.registerBean("Audi R8", Vehicle.class, audiSupplier);
//        }
//
//        Vehicle volkswagenVehicle = null;
//        Vehicle audiVehicle = null;
//
//        try {
//            volkswagenVehicle = context.getBean("voklswagen", Vehicle.class);
//        } catch (NoSuchBeanDefinitionException e) {
//            System.out.println("Bhai ye na random number aya hai ye " + randInt);
//        }
//
//        try {
//            audiVehicle = context.getBean("Audi R8", Vehicle.class);
//        } catch (NoSuchBeanDefinitionException e) {
//            System.out.println("Bhai audi nahi aayi " + randInt);
//        }
//
//        System.out.println("volkswagen ka game " + volkswagenVehicle);
//        System.out.println("\n\n");
//        System.out.println("Audi R8 Ka game " + audiVehicle);
    }
}
