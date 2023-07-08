package com.example.spring_course.hibernate.many_to_one;

import com.example.spring_course.hibernate.relations.one_to_many.uni.entity.Department;
import com.example.spring_course.hibernate.relations.one_to_many.uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToOneUniDirectionTest {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {

            Department department = new Department("IT", 1000, 2000);
            Employee emp1 = new Employee("Birzhan", "Amanov", 700);
            Employee emp2 = new Employee("Serik", "Sarkulov", 800);
            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();

//            session.save(department);

            Employee getEmployee1 = session.get(Employee.class, 3);
            System.out.println("Employee1 details: " + getEmployee1);
            Department department9 = session.get(Department.class, 9);
            session.remove(department9);

            session.getTransaction().commit();
        }
    }
}
