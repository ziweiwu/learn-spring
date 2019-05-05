package com.ziwei.springboot.demo.employeeportalprototype.dao;


import com.ziwei.springboot.demo.employeeportalprototype.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

  // define field for entity manager

  private EntityManager entityManager;

  // set up constructor injection
  @Autowired
  public EmployeeDAOHibernateImpl(EntityManager theEntityManager){
    entityManager = theEntityManager;
  }

  @Override
  public List<Employee> findAll() {

    List<Employee> employees =  entityManager.createQuery("FROM Employee", Employee.class);

    // execute query and get result list

    // return the results
    return employees;
  }

  @Override
  public Employee findByID(int id) {
    // get the current hibernate session
    Session currentSession = entityManager.unwrap(Session.class);

    // get the employee
    Employee employee = currentSession.get(Employee.class, id);

    // return the employee
    return employee;
  }

  @Override
  public void save(Employee employee) {
    // get the current hibernate session
    Session currentSession = entityManager.unwrap(Session.class);

    //  save employee
    currentSession.saveOrUpdate(employee);
  }

  @Override
  public void deleteById(int id) {
    // get the current hibernate session
    Session currentSession = entityManager.unwrap(Session.class);

    // delete object with primary key
    String query  = "DELETE FROM Employee WHERE id=:employeeId";
    Query theQuery  = currentSession.createQuery(query);
    theQuery.setParameter("employeeId", id);

    theQuery.executeUpdate();
  }
}
