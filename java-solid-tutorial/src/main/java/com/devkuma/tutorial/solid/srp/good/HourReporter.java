package com.devkuma.tutorial.solid.srp.good;

// 인사팀 업무
public abstract class HourReporter {

    private Employee employee;

    public HourReporter(Employee employee) {
        this.employee = employee;
    }

    abstract void reportHours();
}