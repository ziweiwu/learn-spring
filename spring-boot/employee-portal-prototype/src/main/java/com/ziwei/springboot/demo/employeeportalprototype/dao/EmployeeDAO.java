package com.ziwei.springboot.demo.employeeportalprototype.dao;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

  List<Employee> findAll();

  public Employee findByID(int id);

  public void save(Employee employee);

  public void deleteById(int id);
}
