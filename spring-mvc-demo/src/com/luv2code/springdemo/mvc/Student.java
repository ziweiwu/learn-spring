package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

  private String firstName;
  private String lastName;
  private String country;
  private String favoriteLanguage;

  public String getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(String operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

  private String operatingSystems;

  private LinkedHashMap<String, String> countryOptions;
  private LinkedHashMap<String, String> favoriteLanguageOptions;

  public String getFavoriteLanguage() {
    return favoriteLanguage;
  }

  public void setFavoriteLanguage(String favoriteLanguage) {
    this.favoriteLanguage = favoriteLanguage;
  }

  public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
    return favoriteLanguageOptions;
  }

  public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
    this.favoriteLanguageOptions = favoriteLanguageOptions;
  }

  public Student() {

    // populate country options: used ISO country code
    countryOptions = new LinkedHashMap<>();

    countryOptions.put("CN", "China");
    countryOptions.put("US", "United States");
    countryOptions.put("CA", "Canada");
    countryOptions.put("FR", "France");

    // populate favorite language options
    favoriteLanguageOptions = new LinkedHashMap<>();
    favoriteLanguageOptions.put("Java", "Java");
    favoriteLanguageOptions.put("Python", "Python");
    favoriteLanguageOptions.put("C++", "C++");
    favoriteLanguageOptions.put("C", "C");
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

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LinkedHashMap<String, String> getCountryOptions() {
    return countryOptions;
  }

  public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
    this.countryOptions = countryOptions;
  }
}
