package com.fengzhuang;

import java.util.*;

public class Account {
    private String name;
    private double weight;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>1&&name.length()<5)
        this.name = name;
        else this.name = "liming";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>20)
        this.weight = weight;
        else this.weight = 1000;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6)
        this.password = password;
        else
            this.password = "111111";
    }
    public void info()
    {
        System.out.println(this.name);
    }
}

