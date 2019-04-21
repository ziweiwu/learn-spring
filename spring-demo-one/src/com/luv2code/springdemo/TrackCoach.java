package com.luv2code.springdemo;

public class TrackCoach implements Coach {

  // define a private field for the dependency
  private FortuneService fortuneService;

  public TrackCoach(FortuneService fortuneService){
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {
    return "Just do it: " + this.fortuneService.getFortune();
  }
}
