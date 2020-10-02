package com.test.dataskills;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


public class Input {

    private String firstName;
    private String lastName;
    private List<String> addresses;

    public Input(){}
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

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Input(String firstName, String lastName, List<String> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }
}
