package com.ziwei.springboot.demo.employeeportalprototype.service;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;

import java.util.List;

public interface EmployeeService {

  public List<Employee> findAll();

  public Employee findById(int id);

  public void save(Employee employee);

  public void deleteById(int id);
}
