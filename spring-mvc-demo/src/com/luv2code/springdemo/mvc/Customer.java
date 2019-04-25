package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

  private String firstName;

  // validation for last name
  // last name cannot be null and at least 1 char long
  @NotNull(message = "Required")
  @Size(min = 1, message = "Required")
  private String lastName;

  // validate number
  // Use object wrapper Integer to allow field to be null
  @NotNull(message = "Required")
  @Min(value=0, message = "must be greater than or equal to zero")
  @Max(value = 10, message = "must be less than or equal to 10")
  private Integer freePasses;

  // Use regular expression to validate string input
  @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
  private String postalCode;

  @CourseCode(value="TOPS", message = "must start with TOPS")
  private String courseCode;


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

  public Integer getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(Integer freePasses) {
    this.freePasses = freePasses;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }
}
