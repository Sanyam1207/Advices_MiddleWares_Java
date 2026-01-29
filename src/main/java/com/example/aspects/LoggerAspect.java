package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example..*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " Method Exec started ");
        Instant start  = Instant.now();
        Object result = joinPoint.proceed();
        Instant finished = Instant.now();
        long timeElapsed = Duration.between(start, finished).toMillis();
        logger.info(" Time took to exec the method  " + timeElapsed );
        return result;
    }
}
