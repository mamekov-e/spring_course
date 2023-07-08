package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(public * get*(..)))")
    protected void getMethods() {
    }

    @Pointcut("execution(public * return*(..))")
    protected void returnMethods() {
    }

    @Pointcut("getMethods() || returnMethods()")
    protected void getAndReturnMethods() {
    }

    @Pointcut("execution(* com.example.spring_course.aop.models.UniLibrary.*(..))")
    protected void allMethods() {
    }

    @Pointcut("execution(* com.example.spring_course.aop.models.UniLibrary.add*(..))")
    protected void allAddMethods() {
    }

    @Pointcut("allMethods() && !allAddMethods()")
    protected void allMethodsExceptAddFromUniLibrary() {
    }

}
