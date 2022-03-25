package com.devkuma.tutorial.solid.srp.good;

// 공유 데이터
public class Employee {
    private Integer id;
    private String name;
    private Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
