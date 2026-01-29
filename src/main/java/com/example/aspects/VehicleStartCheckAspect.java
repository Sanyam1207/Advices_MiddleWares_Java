package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class VehicleStartCheckAspect{
    Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.example.beans.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinpoint, boolean vehicleStarted) throws Throwable{
        if (!vehicleStarted) throw new RuntimeException("Vehicle start nahi hua");
    }
}
