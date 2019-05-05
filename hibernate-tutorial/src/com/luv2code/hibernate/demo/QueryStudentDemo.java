package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
  public static void main(String[] args) {

    // create session factory
    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();

    // create session
    Session session = factory.getCurrentSession();

    try {
      // start a transaction
      session.beginTransaction();

      // query students
      List<Student> theStudents = session
              .createQuery("from Student").getResultList();

      System.out.println("\n\nDisplay all students");
      displayStudents(theStudents);

      // query students with last name wu
      theStudents = session.createQuery(
             "from Student s where s.lastName = 'Wu'"
      ).getResultList();

      System.out.println("\n\nDisplay students with last namw wu");
      displayStudents(theStudents);

      // query students with last name wu or first name linlu
      theStudents = session.createQuery(
              "from Student s where s.firstName = 'Linlu' " +
                      "OR s.lastName = 'Wu'"
      ).getResultList();
      System.out.println("\n\nDisplay students with first name Linlu or last name Wu");
      displayStudents(theStudents);

      // query students whose email ends with gmail.com
      theStudents = session.createQuery(
              "from Student s where s.email like '%gmail.com'"
      ).getResultList();
      System.out.println("\n\nDisplay students whose email ends with gmail.com");
      displayStudents(theStudents);

      // commit transaction
      session.getTransaction().commit();
    } finally {
      factory.close();
    }
  }

  private static void displayStudents(List<Student> theStudents) {
    for(Student tempStudent: theStudents){
      System.out.println(tempStudent);
    }
  }
}
