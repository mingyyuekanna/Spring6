package com.openai.Test;

import lombok.Setter;
import lombok.ToString;

import java.util.*;

public class ListAndSet {
    private List<String> names;

    private Set<String> address;

    private Map<Integer, String> tel;

    private Properties properties;

    @Override
    public String toString() {
        return "ListAndSet{" +
                "names=" + names +
                ", address=" + address +
                ", tel=" + tel +
                '}';
    }

    public void setTel(Map<Integer, String> tel) {
        this.tel = tel;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }
}
