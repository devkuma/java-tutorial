package com.devkuma.tutorial.solid.ocp.good;

public class Employee {
    private String description;

    private String[] names;

    public Employee(String description, String[] names) {
        this.description = description;
        this.names = names;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }
}