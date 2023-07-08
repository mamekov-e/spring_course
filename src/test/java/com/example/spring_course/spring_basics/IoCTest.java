package com.example.spring_course.spring_basics;

import com.example.spring_course.spring_basics.models.Dog;
import com.example.spring_course.spring_basics.models.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    public static void main(String[] args) {
        // java impl
        javaImplementation();

        // spring impl
        springImplementation();
    }

    private static void javaImplementation() {
        System.out.println("Java impl IoC:");
        Pet pet = new Dog();
        pet.say();
    }

    private static void springImplementation() {
        System.out.println("Spring impl IoC:");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DIAndIoCTestContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
