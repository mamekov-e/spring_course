package com.example.spring_course.hibernate.many_to_many;

import com.example.spring_course.hibernate.relations.many_to_many.entity.Child;
import com.example.spring_course.hibernate.relations.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyTest {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession();) {

            // adding children to section
            Section section1 = new Section("Football");
            Child child1 = new Child("Kirill", 7);
            Child child2 = new Child("Nikita", 5);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);

            // adding sections for child
            Child child3 = new Child("Samat", 10);
            Section section2 = new Section("Chess");
            Section section3 = new Section("Tennis");
            child3.addSectionToChild(section2);
            child3.addSectionToChild(section3);

            session.beginTransaction();
//            session.persist(section1);
//            session.persist(child3);

            Section chess = session.get(Section.class, 2);
//            Section tennis = session.get(Section.class, 3);

//            session.delete(tennis);
//            session.delete(chess);
            System.out.println(chess);

            session.getTransaction().commit();

        }

    }
}
