package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.example.spring_course.aop.aspects.Pointcuts.getMethods()")
    public void beforeAnyGetMethodExceptionHandlingAdvice(){
        System.out.println("beforeAnyGetMethodExceptionHandlingAdvice: throw/catch exception #1");
        System.out.println("----------------------------------------");

    }
}
