package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {


  @RequestMapping("/showForm")
  public String showForm(Model theModel) {

    // add student object to the model
    theModel.addAttribute("customer", new Customer());

    return "customer-form";
  }

  @RequestMapping("/processForm")
  public String processform(@Valid @ModelAttribute("customer") Customer customer
          , BindingResult theBindingresult
  ) {

    // log the input data
    System.out.println("customer: " + customer.getFirstName()
            + " " + customer.getLastName());

    if (theBindingresult.hasErrors()) {
      return "customer-form";
    } else {
      return "customer-confirmation";
    }
  }
}
