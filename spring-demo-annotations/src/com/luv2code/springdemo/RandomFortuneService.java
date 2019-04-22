package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class RandomFortuneService implements FortuneService {

  private String[] data = {
          "Today is your super lucky day",
          "Today is lucky day",
          "Luckier you get the harder you work"
  };

  private Random myRandom = new Random();


  @Override
  public String getFortune() {
    int index = myRandom.nextInt(data.length);

    String theFortune = data[index];

    return theFortune;
  }
}
