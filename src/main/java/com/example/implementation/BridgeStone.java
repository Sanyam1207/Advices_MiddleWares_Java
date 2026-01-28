package com.example.implementation;

import com.example.beans.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStone implements Tyres {
    public String rotate(){
        return " Moving with the bridgeStone tyres ";
    }
}
