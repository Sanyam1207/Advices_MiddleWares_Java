package com.example.implementation;

import com.example.beans.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound(){
        return " Bose speakers playing in the bg";
    }
}
