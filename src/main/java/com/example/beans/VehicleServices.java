package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music  = speakers.makeSound();
        System.out.println("Playing some of the melodies " + music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println("Tyres rotating " + status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
