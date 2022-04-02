package com.devkuma.tutorial.solid.isp.ex2;

public class Lizard implements Reptile {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}