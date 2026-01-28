package com.example.implementation;

import com.example.beans.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TataTyres implements Tyres {
    public String rotate(){
        return " Moving with Tata tyres ";
    }
}
