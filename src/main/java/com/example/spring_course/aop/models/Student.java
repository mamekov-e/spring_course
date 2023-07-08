package com.example.spring_course.aop.models;

public class Student {
    private String fullName;
    private int course;
    private double avgGrade;

    public Student(String fullName, int course, double avgGrade) {
        this.fullName = fullName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String fullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public int course() {
        return course;
    }

    public Student setCourse(int course) {
        this.course = course;
        return this;
    }

    public double avgGrade() {
        return avgGrade;
    }

    public Student setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
