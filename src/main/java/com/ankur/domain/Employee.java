package com.ankur.domain;

public class Employee {

    private int id;
    private String name;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
