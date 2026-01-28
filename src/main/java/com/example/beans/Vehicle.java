package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name = "Mercedes";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices){
        this.vehicleServices = vehicleServices;
    }
    public void setName(String name) {
        this.name = name;
    }
//    @PostConstruct
    public void initialise(){
        this.name = "Sanyam";
        System.out.println("hogya bhai post construct wala kaam");
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Hello there spring world");
    }
}
