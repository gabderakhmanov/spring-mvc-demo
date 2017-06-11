package com.abg.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by maxim on 6/11/17.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String country;

    private LinkedHashMap<String,String> countryOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("DK", "Denmark");
        countryOptions.put("RU", "Russia");
        countryOptions.put("SW", "Sweden");
        countryOptions.put("BR", "Brazil");
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

    public HashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
}
