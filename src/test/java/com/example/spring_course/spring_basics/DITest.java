package com.example.spring_course.spring_basics;

import com.example.spring_course.spring_basics.models.Dog;
import com.example.spring_course.spring_basics.models.Person;
import com.example.spring_course.spring_basics.models.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    public static void main(String[] args) {
        // java impl
        javaImplementation();

        // spring impl
        springImplementation();
    }

    private static void javaImplementation() {
        System.out.println("Java impl DI:");
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callMyPet();
    }

    private static void springImplementation() {
        System.out.println("Spring impl DI:");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DIAndIoCTestContext.xml", "scopeTestContext.xml");

        Person person = context.getBean("myPerson2", Person.class);
        person.callMyPet();
        System.out.printf("Surname: %s, age: %d", person.surname(), person.age());

        context.close();
    }
}
