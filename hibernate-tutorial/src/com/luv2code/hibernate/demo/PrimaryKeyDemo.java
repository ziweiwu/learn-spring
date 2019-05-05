package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

  public static void main(String[] args) {

    // create session factory
    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();

    // create session
    Session session = factory.getCurrentSession();

    try{
      // create 3 students object
      System.out.println("Create a 3 student object...");
      Student tempStudent1 = new Student("Linlu", "Zhu", "lz@gmail.com");
      Student tempStudent2 = new Student("John", "Doe", "jd@gmail.com");
      Student tempStudent3 = new Student("Mary", "An", "ma@gmail.com");

      // start a transaction
      session.beginTransaction();

      // save the student object
      System.out.println("Saving the student...");
      session.save(tempStudent1);
      session.save(tempStudent2);
      session.save(tempStudent3);

      // commit transaction
      session.getTransaction().commit();
      System.out.println("Done");
    }
    finally {
      factory.close();
    }
  }
}
