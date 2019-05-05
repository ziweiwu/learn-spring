package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
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

      // get the student with id: 1
      Student myStudent = session.get(Student.class, studentID);
      System.out.println("Delete student:" + myStudent);

      // delete the student with id: 1 if it's not null
      if(myStudent!=null){
        session.delete(myStudent);
      }

      // delete the student with id: 2
      System.out.println("Delete student id=2");
      session.createQuery("delete from Student where id=2")
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
