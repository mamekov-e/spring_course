package com.example.spring_course.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdviceLoggingAspect {
    @Around("execution(String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: trying to return book");

        Object obj = proceedingJoinPoint.proceed();
        obj = "New book";

        System.out.println("aroundReturnBookAdvice: returned book");
        return obj;
    }

}
