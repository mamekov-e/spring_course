package com.example.spring_course.aop.models;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook(Book book) {
        System.out.println("Get book from SchoolLibrary: " + book.name());
    }

    public String returnBook() {
        System.out.println("Return book to SchoolLibrary");
        return "ok";
    }
}
