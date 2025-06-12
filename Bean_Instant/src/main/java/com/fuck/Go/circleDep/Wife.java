package com.fuck.Go.circleDep;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Wife {
    private String name;
    private Husband husband;

    public Husband getHusband() {
        return husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
