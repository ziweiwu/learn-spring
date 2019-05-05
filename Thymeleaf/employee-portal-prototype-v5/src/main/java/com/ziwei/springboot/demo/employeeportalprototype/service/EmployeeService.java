package com.ziwei.springboot.demo.employeeportalprototype.service;

import java.util.List;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;

public interface EmployeeService {

  public List<Employee> findAll();

  public Employee findById(int theId);

  public void save(Employee theEmployee);

  public void deleteById(int theId);

}

