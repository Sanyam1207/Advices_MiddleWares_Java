package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {
    private String Name = "Sanyam";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
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
}
