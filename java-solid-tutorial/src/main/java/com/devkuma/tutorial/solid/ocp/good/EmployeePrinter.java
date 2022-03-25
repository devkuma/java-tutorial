package com.devkuma.tutorial.solid.ocp.good;

public class EmployeePrinter {

    public void print(Employee employee) {
        System.out.println(employee.getDescription());
        employee.printNames();
    }
}
