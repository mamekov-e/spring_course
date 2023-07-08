package com.example.spring_course.aop.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("some Book")
    private String name;

    public String name() {
        return name;
    }
}
