package com.example.spring_course.aop;

import com.example.spring_course.aop.config.SpringConfigAop;
import com.example.spring_course.aop.models.Book;
import com.example.spring_course.aop.models.SchoolLibrary;
import com.example.spring_course.aop.models.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigAop.class);

        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook(book);
//        uniLibrary.getMagazine(10);
//        uniLibrary.addBook();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook(book);
//        schoolLibrary.returnBook();
    }
}
