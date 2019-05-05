package com.ziwei.springboot.demo.employeeportalprototype.controller;

import java.util.List;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;
import com.ziwei.springboot.demo.employeeportalprototype.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

  private EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService theEmployeeService) {
    employeeService = theEmployeeService;
  }

  // add mapping for "/list"
  @GetMapping("/list")
  public String listEmployees(Model theModel) {

    // get employees from db
    List<Employee> theEmployees = employeeService.findAll();

    // add to the spring model
    theModel.addAttribute("employees", theEmployees);

    return "employees/list-employees";
  }

  @GetMapping("/showFormForAdd")
  public String showFormForAdd(Model theModel) {

    Employee employee = new Employee();

    theModel.addAttribute("employee", employee);

    return "employees/employee-form";
  }

  @GetMapping("/showFormForUpdate")
  public String showFormForUpdate(@RequestParam("employeeId") int id, Model model) {

    // get the employee from the service
    Employee employee = employeeService.findById(id);

    // set employee as a model attribute to pre-populate the form
    model.addAttribute("employee", employee);

    // send over to our form
    return "employees/employee-form";
  }

  @GetMapping("/showFormForDelete")
  public String showFormForDelete(@RequestParam("employeeId") int id) {

    // delete employee by id
    employeeService.deleteById(id);

    // redirect to employee list
    return "redirect:/employees/list";
  }

  @PostMapping("/save")
  public String saveEmployee(@ModelAttribute("employee") Employee employee) {

    // save the employee
    employeeService.save(employee);

    // use a redirect to prevent duplicate submissions
    return "redirect:/employees/list";
  }
}










