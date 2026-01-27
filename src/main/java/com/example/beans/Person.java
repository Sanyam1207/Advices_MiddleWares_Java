package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String Name = "Sanyam";

    @Autowired
    private Vehicle vehicle;

    public Person() {
        System.out.println("Person class have been created");
    }

    public String getName() {
        return Name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
