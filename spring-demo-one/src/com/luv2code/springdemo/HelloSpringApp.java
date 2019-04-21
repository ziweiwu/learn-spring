package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

  public static void main(String[] args) {

    // load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConText.xml");


    // retrieve bean from spring container
    Coach theCoach = context.getBean("myCoach", Coach.class);

    // call method on the bean
    System.out.println(theCoach.getDailyWorkout());

    // Call fortune
    System.out.println(theCoach.getDailyFortune());

    // close the context
    context.close();
  }
}
