package com.example.spring_course.hibernate.one_to_one;

import com.example.spring_course.hibernate.relations.one_to_one.uni.entity.Details;
import com.example.spring_course.hibernate.relations.one_to_one.uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDirectionTest {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Employee employee = new Employee("Kesha", "Smakova", "Sales", 1000);
            Details details = new Details("Moscow", "987654321", "kesha@gmail.com");
            employee.setEmpDetail(details);

            session.beginTransaction();

            session.save(employee);

            Employee getEmployee1 = session.get(Employee.class, 1);
            System.out.println("Employee1 details: " + getEmployee1.getEmpDetail());

            session.getTransaction().commit();
        }
    }
}
