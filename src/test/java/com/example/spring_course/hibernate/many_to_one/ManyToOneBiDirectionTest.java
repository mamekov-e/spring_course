package com.example.spring_course.hibernate.many_to_one;

import com.example.spring_course.hibernate.relations.one_to_many.bi.entity.Department;
import com.example.spring_course.hibernate.relations.one_to_many.bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToOneBiDirectionTest {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Department department = new Department("HR", 5000, 10000);
            Employee emp1 = new Employee("Kesha", "Smakova", 1000);
            Employee emp2 = new Employee("Nigina", "Razetta", 1500);
            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();

            session.save(department);

//            Employee getEmployee1 = session.get(Employee.class, 1);
//            System.out.println("Employee1 details: " + getEmployee1);

//            System.out.println("Get department7");
            Department department7 = session.get(Department.class, 9);
//            System.out.println("Show department7");
//            System.out.println(department7);
//            System.out.println("Show employees");
//            System.out.println(department7.getEmployeesList());
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!update dep by dep");
//            session.detach(department7);
//            department7.setName("dep9---");
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!update emp by dep");
//            department7.getEmployeesList().get(0).setSalary(5000);
//            session.merge(department7);
//            Employee employee = session.get(Employee.class, 3);
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!update dep by emp");
//            employee.getDepartment().setName("dep8");
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!update dep by emp");
//            employee.setSurname("Emp3-");
//            employee.getDepartment().setName("NEW dep");
            session.remove(department7);

            session.getTransaction().commit();
        }
    }
}
