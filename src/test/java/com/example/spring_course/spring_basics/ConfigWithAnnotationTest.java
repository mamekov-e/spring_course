package com.example.spring_course.spring_basics;

import com.example.spring_course.spring_basics.models.Dog;
import com.example.spring_course.spring_basics.models.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configWithAnnotationTestContext.xml");

        Dog dog = context.getBean("myDog", Dog.class);
        dog.setName("Lokky");
        System.out.println("Dog name: " + dog.name());
        dog.say();

        Person person = context.getBean("personBean", Person.class);
        person.callMyPet();

        System.out.printf("Surname: %s, age: %s\n", person.surname(), person.age());

        context.close();
    }
}
