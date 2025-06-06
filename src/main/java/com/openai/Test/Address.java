package com.openai.Test;

import lombok.Setter;

public class Address {
    private String city;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    private String street;

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
