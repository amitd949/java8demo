package com.example.demo.controller.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MeasurementAspect {
    @Around("@annotation(com.example.demo.controller.aop.Timed1)")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Calling measure method of job execution time ");
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println("Joint cut of measing methos :: is ::**** " + joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}
