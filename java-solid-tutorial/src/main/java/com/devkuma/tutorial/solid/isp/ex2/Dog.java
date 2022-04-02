package com.devkuma.tutorial.solid.isp.ex2;

public class Dog implements Mammal {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void cry() {
        System.out.println("cry");
    }
}