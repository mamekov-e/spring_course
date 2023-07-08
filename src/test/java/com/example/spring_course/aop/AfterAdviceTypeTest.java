package com.example.spring_course.aop;

import com.example.spring_course.aop.config.SpringConfigAop;
import com.example.spring_course.aop.models.Student;
import com.example.spring_course.aop.models.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterAdviceTypeTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigAop.class);
        University university = context.getBean("university", University.class);

        university.addStudent();
        try {

        List<Student> studentList = university.getStudents();
        System.out.println("Returned list: \n" + studentList);
        } catch (Exception e) {
            System.out.println("Exception when getting students: " + e);
        }

        context.close();
    }
}
