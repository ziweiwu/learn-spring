package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
  public static void main(String[] args) {
    // read a Spring java config file
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    // get the bean from spring container
    Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

    // call a method on the bean
    System.out.println(tennisCoach.getDailyWorkout());

    System.out.println(tennisCoach.getDailyFortune());

    // close the context
    context.close();

  }
}
