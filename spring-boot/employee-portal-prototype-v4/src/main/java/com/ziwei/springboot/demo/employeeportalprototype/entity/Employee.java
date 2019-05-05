package com.ziwei.springboot.demo.employeeportalprototype.entity;

import javax.persistence.*;

// data-REST provide rest api for free, localhost:8080/employees
@Entity
@Table(name="employee")
public class Employee {
  // define fields

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email")
  private String email;

  @Column(name="office")
  private String office;

  // define constructors
  public Employee(){}

  public Employee(String firstName, String lastName, String email, String office) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.office = office;
  }

  // define getter/setter
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", office='" + office + '\'' +
            '}';
  }
}
