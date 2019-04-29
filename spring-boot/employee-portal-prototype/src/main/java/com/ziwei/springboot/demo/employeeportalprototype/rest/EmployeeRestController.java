package com.ziwei.springboot.demo.employeeportalprototype.rest;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;
import com.ziwei.springboot.demo.employeeportalprototype.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeService employeeService;

  // quick and dirty: inject employee dao
  @Autowired
  public EmployeeRestController(EmployeeService employeeService){
    this.employeeService=employeeService;
  }

  // expose "/employees" and return list of employees
  @GetMapping("/employees")
  public List<Employee> findAll(){
    return employeeService.findAll();
  }

  // add mapping for GET /employee/{employeeId}
  @GetMapping("/employees/{employeeId}")
  public Employee getEmployee(@PathVariable int employeeId){

    Employee employee = employeeService.findById(employeeId);

    // throw exception is employee is not found
    if(employee == null){
      throw new RuntimeException("Employee id not found - " + employeeId);
    }
    return employee;
  }

  // add mapping for POST /employee/
  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee employee){
    // just in case they pass an id in JSON... set id to 0
    // forces a save of new item instead of update

    employee.setId(0);

    employeeService.save(employee);

    return employee;
  }


  // add mapping for PUT /employees
  @PutMapping("employees")
  public Employee updateEmployee(@RequestBody Employee employee){

    employeeService.save(employee);

    return  employee;
  }

  // add mapping for DELETE /employee/{employeeId} - delete employee
  @DeleteMapping("/employees/{employeeId}")
  public String deleteEmployee(@PathVariable int employeeId){
    Employee employee = employeeService.findById(employeeId);

    // Throw exception if null
    if(employee == null){
      throw new RuntimeException("Employee id not found - " + employeeId);
    }

    employeeService.deleteById(employeeId);

    return "Deleted employee id - " + employeeId;
  }
}
