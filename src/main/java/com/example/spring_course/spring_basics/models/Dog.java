package com.example.spring_course.spring_basics.models;

/*
if we don't specify bean id, bean will be created using next rules:
 - class name with lower casing first letter: Dog => id:dog
 - leave the same as class name
   if 2 upper case letters in class name at the beginning: SQLClass => id:SQLClass
*/
//@Component("myDog")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Bean Dog is created");
    }

    public String name() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Gav-Gav");
    }
}
