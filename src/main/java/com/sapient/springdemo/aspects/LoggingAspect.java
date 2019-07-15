package com.sapient.springdemo.aspects;

import com.sapient.springdemo.service.EmployeeService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.sapient.springdemo.service.EmployeeServiceImpl.saveEmployee(..))")
    public void logBefore(JoinPoint target) {
        System.out.println("------------logging before the method is getting executed-------------------");
        System.out.println(target.getArgs()[0]);
        System.out.println(target.getTarget() instanceof EmployeeService);
    }
}