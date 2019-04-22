package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
  public static void main(String[] args) {
    // read a Spring java config file
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    // get the bean from spring container
    SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

    // call a method on the bean
    System.out.println(coach.getDailyWorkout());

    System.out.println(coach.getDailyFortune());

    // call our swim coach methods
    System.out.println("email: " + coach.getEmail());
    System.out.println("team: " + coach.getTeam());

    // close the context
    context.close();

  }
}
