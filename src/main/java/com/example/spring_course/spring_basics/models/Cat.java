package com.example.spring_course.spring_basics.models;

//@Component
//@Scope("prototype")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Bean Cat is created");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Cat: init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Cat: destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Mew-Mew");
    }
}
