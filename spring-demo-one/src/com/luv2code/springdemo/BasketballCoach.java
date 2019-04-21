package com.luv2code.springdemo;

public class BasketballCoach implements Coach{
  // define a private field for the dependency
  private FortuneService fortuneService;

  public BasketballCoach(FortuneService fortuneService){
      this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout(){
    return "Shoot 100 jump shots";
  }

  @Override
  public String getDailyFortune() {
    return this.fortuneService.getFortune();
  }
}
