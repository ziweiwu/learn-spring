package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
  public static void main(String[] args) {

    // create session factory
    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();

    // create session
    Session session = factory.getCurrentSession();

    try{
      int studentID = 1;

      // get a new ssession and start transaction
      session = factory.getCurrentSession();
      session.beginTransaction();

      // Get student with id:1
      System.out.println("\nGetting student with id: " + studentID);

      Student myStudent = session.get(Student.class, studentID);

      System.out.println("Updating student... ");
      myStudent.setEmail("wzzzz@gmail.com");

      // commit the transaction
      session.getTransaction().commit();

      // update email for all students
      session = factory.getCurrentSession();
      session.beginTransaction();

      System.out.println("Update email for all students");

      session.createQuery("update Student set email='foo@gmail.com'")
              .executeUpdate();

      // commit the transaction
      session.getTransaction().commit();


      System.out.println("Done!");
    }
    finally {
      factory.close();
    }
  }
}
