package com.example.spring_course.aop.aspects;

import com.example.spring_course.aop.models.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    // log all get methods
    @Before("com.example.spring_course.aop.aspects.Pointcuts.getMethods()")
    public void beforeAnyGetLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("called method " + methodSignature.getMethod());

        if ("getBook".equals(methodSignature.getName())) {
            Object[] methodArgs = joinPoint.getArgs();
            for (Object o: methodArgs) {
                Book book = (Book) o;
                System.out.println("sent book to parameter: " + book.name());
            }
        }


        System.out.println("beforeAnyGetLoggingAdvice: log #1");
        System.out.println("----------------------------------------");
    }

    // log all get and return methods
    @Before("com.example.spring_course.aop.aspects.Pointcuts.getAndReturnMethods()")
    public void beforeGetAndReturnMethodsLoggingAdvice() {
        System.out.println("beforeGetAndReturnMethodsAdvice: log #2");
        System.out.println("----------------------------------------");
    }

    // log all methods except all add methods
    @Before("com.example.spring_course.aop.aspects.Pointcuts.allMethodsExceptAddFromUniLibrary()")
    public void allMethodsExceptAddFromUniLibraryLoggingAdvice() {
        System.out.println("allMethodsExceptAddFromUniLibrary: log #3");
        System.out.println("----------------------------------------");
    }
}
