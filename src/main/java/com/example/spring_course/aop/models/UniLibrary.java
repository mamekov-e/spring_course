package com.example.spring_course.aop.models;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook(Book book) {
        System.out.println("Get book from UniLibrary: " + book.name());
    }

    public void getMagazine(int amount) {
        System.out.println("Get magazine from UniLibrary with amount: " + amount);
    }

    public String returnBook() {
        System.out.println("Return book to UniLibrary");
        return "ok";
    }

    public String returnMagazine() {
        System.out.println("Return magazine to UniLibrary");
        return "ok";
    }

    public void addBook() {
        System.out.println("Add book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Add magazine to UniLibrary");
    }
}
