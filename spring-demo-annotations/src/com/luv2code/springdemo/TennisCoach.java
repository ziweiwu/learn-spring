package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// if component annotation doesn't specify a bean ID, the default bean ID is tennisCoach
@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println(">> Inside default constructor");
    }

    //define a setter method
    @Autowired
    public void doSomething(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /*
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
