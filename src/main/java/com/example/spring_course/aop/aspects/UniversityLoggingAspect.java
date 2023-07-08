package com.example.spring_course.aop.aspects;

import com.example.spring_course.aop.models.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Pointcut("execution(* getStudents())")
    private void getStudentPointcut() {
    }

    @Before("getStudentPointcut()")
    public void beforeGetAllStudentsLoggingAdvice() {
        System.out.println("beforeGetAllStudentsAdvice: get all students log");
    }

    @AfterReturning(pointcut = "getStudentPointcut()",
            returning = "students")
    public void afterReturningGetAllStudentsLoggingAdvice(List<Student> students) {
        Student st1 = students.get(0);
        st1.setCourse(5);
        st1.setFullName("Alia Smakova");
        System.out.println("afterReturningGetAllStudentsAdvice: after returning get all students log");
    }

    @AfterThrowing(pointcut = "getStudentPointcut()",
            throwing = "exception")
    public void afterThrowingGetAllStudentLoggingAdvice(Exception exception){
        System.out.println("afterThrowingGetAllStudentLoggingAdvice: throwing  exception log " + exception);
    }

    @After("getStudentPointcut()")
    public void afterGetAllStudentsMethodLoggingAdvice() {
        System.out.println("afterGetAllStudentsMethodLoggingAdvice: after get all students log");
    }
}
