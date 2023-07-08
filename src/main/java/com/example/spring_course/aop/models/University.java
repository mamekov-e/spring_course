package com.example.spring_course.aop.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Erik Shelbie", 4, 3.5);
        Student st2 = new Student("Maria Latte", 3, 3.7);
        Student st3 = new Student("Rahul Sergalez", 2, 4.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Starting method getStudents");
        students.get(4);
        System.out.println("Get student from method getStudents()");
        System.out.println(students);

        return students;
    }
}
