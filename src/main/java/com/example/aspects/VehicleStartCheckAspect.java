package com.example.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class VehicleStartCheckAspect{
    Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.example.services.*.*(..) && args(vehicleStarted,..)")
    public void checkVehicleStarted(Joinpoint joinpoint, boolean vehicleStarted) throws Throwable{
        if (!vehicleStarted) throw new RuntimeException("Vehicle start nahi hua");
    }
}
