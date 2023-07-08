package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    // check for secure all get methods
    @Before("com.example.spring_course.aop.aspects.Pointcuts.getMethods()")
    public void beforeAnyGetSecurityAdvice() {
        System.out.println("beforeAnyGetSecurityAdvice: security #1");
        System.out.println("----------------------------------------");
    }
}
