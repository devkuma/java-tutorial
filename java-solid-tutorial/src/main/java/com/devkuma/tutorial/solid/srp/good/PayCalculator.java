package com.devkuma.tutorial.solid.srp.good;

// 경리팀 업무
public abstract class PayCalculator {

    private Employee employee;

    public PayCalculator(Employee employee) {
        this.employee = employee;
    }

    abstract void reportHours();
}