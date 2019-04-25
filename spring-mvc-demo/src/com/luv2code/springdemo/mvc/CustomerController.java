package com.luv2code.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

  @InitBinder
  public void initBinder(WebDataBinder dataBinder){
    // set true to StringTrimmerEditor makes the string null if
    // string is all white space
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

    dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
  }


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
    System.out.println("customer last name:" + customer.getLastName());
    System.out.println("customer free passes:" + customer.getFreePasses());

    // log the input errors
    System.out.println("Binding result: " + theBindingresult);

    if (theBindingresult.hasErrors()) {
      return "customer-form";
    } else {
      return "customer-confirmation";
    }
  }
}
