package com.example.spring_course.hibernate;

import com.example.spring_course.hibernate.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import java.util.List;

public class HibernateCrudTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee("Natalia", "Florova",
                    "CTO", 1050);
            session.beginTransaction();

//            ADD EMPLOYEE
            session.save(employee);
            Employee addedEmp = session.get(Employee.class, employee.getId());
            System.out.println("Employee added: " + addedEmp);

//            UPDATE EMPLOYEE
            Employee changeEmp = session.get(Employee.class, 3);
            changeEmp.setSalary(700);
            changeEmp.setSurname("Portman");

            session.createQuery("UPDATE Employee set salary = 1000 where name = 'Kamila'")
                    .executeUpdate();

//            DELETE EMPLOYEE
            session.delete(addedEmp);
            session.createQuery("DELETE Employee where name='Elnur'").executeUpdate();

            List<Employee> employeeList = session.createQuery("from Employee")
                    .getResultList();

            for (Employee e : employeeList) {
                System.out.println(e);
            }
            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
