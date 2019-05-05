package com.ziwei.springboot.demo.employeeportalprototype.service;

import com.ziwei.springboot.demo.employeeportalprototype.dao.EmployeeDAO;
import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

  private EmployeeDAO employeeDAO;

  // dependency injection
  @Autowired
  public EmployeeServiceImpl(EmployeeDAO employeeDAO){
    this.employeeDAO = employeeDAO;
  }

  @Override
  @Transactional
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }

  @Override
  @Transactional
  public Employee findById(int id) {
    return employeeDAO.findByID(id);
  }

  @Override
  @Transactional
  public void save(Employee employee) {
    employeeDAO.save(employee);
  }

  @Override
  @Transactional
  public void deleteById(int id) {
    employeeDAO.deleteById(id);
  }
}
