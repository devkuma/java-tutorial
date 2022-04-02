package com.devkuma.tutorial.solid.isp.ex1.good;

import com.devkuma.tutorial.solid.isp.ex1.Animal;

public class Dog implements Animal {
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