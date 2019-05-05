package com.ziwei.springboot.demo.employeeportalprototype.dao;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// extends off Jpa repo providing an entity and a primary key type
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  // add a method to sort by last name
  public List<Employee> findAllByOrderByLastNameAsc();
}
