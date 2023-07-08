package com.example.spring_course.spring_basics;

import com.example.spring_course.spring_basics.models.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("initDestroyTestContext.xml");

        Cat cat = context.getBean("myPet", Cat.class);
        System.out.println("Cat bean: " + cat);
        context.close();
    }
}
