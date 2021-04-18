package com.company.name.dto;

public class PersonNew {

    private String name;
    private String street;


    public PersonNew(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }
}
