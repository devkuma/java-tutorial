package com.devkuma.designpattern.structural.adapter.ex1;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printAge() {
        System.out.println(age);
    }
}