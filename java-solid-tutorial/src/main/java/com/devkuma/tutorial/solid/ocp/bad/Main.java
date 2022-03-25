package com.devkuma.tutorial.solid.ocp.bad;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("직원 정보", new String[]{"devkuma", "araikuma", "kimkc"});
        new EmployeePrinter().print(employee);
    }
}
