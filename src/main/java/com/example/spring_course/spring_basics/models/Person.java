package com.example.spring_course.spring_basics.models;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(
//            @Qualifier("myDog")
            Pet pet) {
        System.out.println("Bean Person is created");
        this.pet = pet;
    }

//    public Person() {
//    }

    public Pet pet() {
        return pet;
    }


    public Person setPet(Pet pet) {
        this.pet = pet;
        return this;
    }

    public String surname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int age() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void callMyPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
