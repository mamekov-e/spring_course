package com.example.spring_course.spring_basics;

import com.example.spring_course.spring_basics.models.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        // if scope is singleton, beans will be created at this stage
        ClassPathXmlApplicationContext singletonContext =
                new ClassPathXmlApplicationContext("scopeTestContext.xml");

        System.out.println("Singleton bean scope");
        testBeansByContext(singletonContext, "singletonScopePet");
        singletonContext.close();

        // if scope is prototype, beans will be created at this stage after calling getBean method
        ClassPathXmlApplicationContext prototypeContext =
                new ClassPathXmlApplicationContext("scopeTestContext.xml");

        System.out.println("\nPrototype bean scope");
        testBeansByContext(prototypeContext, "prototypeScopePet");
        prototypeContext.close();

    }

    private static void testBeansByContext(ClassPathXmlApplicationContext context, String beanName) {
        Dog dog1 = context.getBean(beanName, Dog.class);
        dog1.setName("Barsik");
        Dog dog2 = context.getBean(beanName, Dog.class);
        dog2.setName("Tuzik");

        System.out.println("Beans references to the same object? " + (dog1 == dog2));

        System.out.println("Dog1 ref= " + dog1);
        System.out.println("Dog2 ref= " + dog2);

        System.out.println("Dog1 name= " + dog1.name());
        System.out.println("Dog2 name= " + dog2.name());
    }
}
