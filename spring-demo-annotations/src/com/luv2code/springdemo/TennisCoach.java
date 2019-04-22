package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// if component annotation doesn't specify a bean ID, the default bean ID is tennisCoach
// @Scope allow defining the scope of the class
@Component
@Scope("singleton")
public class TennisCoach implements Coach{

    // Define a field injection using annotation
    // Because there are multiple implementation of FortuneService
    // We need to use @Quantifier to tell Spring which one to use
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println(">> Inside default constructor");
    }

    // define init method
    @PostConstruct
    public void startup() {
        System.out.println("Tennis coach: inside of startup ");
    }

    @PreDestroy
    // define cleanup method
    public void cleanup() {
        System.out.println("Tennis coach: inside of cleanup ");
    }

    /*
    // define a setter injection using annotation
    @Autowired
    public void doSomething(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /*
    //  define a constructor injection using annotation
    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
