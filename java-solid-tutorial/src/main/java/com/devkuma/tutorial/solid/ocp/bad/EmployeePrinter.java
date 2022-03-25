package com.devkuma.tutorial.solid.ocp.bad;

public class EmployeePrinter {

    public void print(Employee employee) {
        System.out.println(employee.getDescription());
        for (String name : employee.getNames()) {
            System.out.println(name);
        }
    }
}
