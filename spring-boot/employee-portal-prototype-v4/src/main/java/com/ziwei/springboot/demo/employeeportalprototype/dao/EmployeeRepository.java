package com.ziwei.springboot.demo.employeeportalprototype.dao;

import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// extends off Jpa repo providing an entity and a primary key type
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
