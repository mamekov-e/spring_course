package com.example.spring_course.spring_basics.config;

import com.example.spring_course.spring_basics.models.Cat;
import com.example.spring_course.spring_basics.models.Person;
import com.example.spring_course.spring_basics.models.Pet;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.spring_course")
@PropertySource("classpath:spring_course_project.properties")
public class SpringConfigBasics {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
