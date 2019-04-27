package com.ziwei.springboot.demo.myApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
  // expose "/" that return "hello World"

  @GetMapping("/")
  public String sayHello(){
    return "Hello World! Time on server is "  + LocalDateTime.now();
  }

  @GetMapping("/hi")
  public String sayHi(){
    return "Hi!";
  }
}
