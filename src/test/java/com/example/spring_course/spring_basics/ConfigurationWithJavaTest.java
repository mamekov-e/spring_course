package com.example.spring_course.spring_basics;

import com.example.spring_course.spring_basics.config.SpringConfigBasics;
import com.example.spring_course.spring_basics.models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationWithJavaTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigBasics.class);

        Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
        person.callMyPet();
        person2.callMyPet();
        System.out.printf("person's 1 surname: %s, age: %d, cat obj ref: %s\n", person.surname(), person.age(), person.pet());
        System.out.printf("person's 1 surname: %s, age: %d, cat obj ref: %s\n", person2.surname(), person2.age(), person2.pet());
    }
}
