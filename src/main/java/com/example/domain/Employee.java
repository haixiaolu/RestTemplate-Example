package com.example.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    private int id;
    @JsonProperty("employee_name")
    private String name;
    @JsonProperty("employee_salary")
    private double salary;
    @JsonProperty("employee_age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
