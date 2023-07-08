package com.example.spring_course.aop;

import com.example.spring_course.aop.config.SpringConfigAop;
import com.example.spring_course.aop.models.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundAdviceTypeTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigAop.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookReturned = library.returnBook();
        System.out.println("Book returned: " + bookReturned);

        context.close();
    }
}
