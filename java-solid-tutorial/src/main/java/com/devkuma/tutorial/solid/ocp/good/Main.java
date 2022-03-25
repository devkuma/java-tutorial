package com.devkuma.tutorial.solid.ocp.good;

import com.devkuma.tutorial.solid.ocp.bad.Employee;
import com.devkuma.tutorial.solid.ocp.bad.EmployeePrinter;

public class Main {

    public static void main(String[] args) {
        com.devkuma.tutorial.solid.ocp.bad.Employee employee = new Employee("직원 정보", new String[]{"devkuma", "araikuma", "kimkc"});
        new EmployeePrinter().print(employee);
    }
}
