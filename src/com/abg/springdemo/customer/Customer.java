package com.abg.springdemo.customer;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by maxim on 6/17/17.
 */
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 3, message = "must be more or equal 3 chars")
    private String lastName;

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
}
