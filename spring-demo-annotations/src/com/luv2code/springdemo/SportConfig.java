package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration specifies the file is a configuration file
//@componentScan setup component scanning
//@ComponentScan("com.luv2code.springdemo")
@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

  // define bean for our fortune service
  @Bean
  public FortuneService loudFortuneService() {
    return new LoudFortuneService();
  }

  // define bean for swim coach and inject dependency
  @Bean
  public Coach swimCoach() {
    return new SwimCoach(loudFortuneService());

  }
}
