package com.devkuma.tutorial.solid.srp.good;

// DB 관린자 업무
public abstract class EmployeeSaver {

    private Employee employee;

    public EmployeeSaver(Employee employee) {
        this.employee = employee;
    }

    // 개발팀에서 사용한다.
    abstract void save();
}