package com.devkuma.tutorial.solid.isp.ex1.bad;

import com.devkuma.tutorial.solid.isp.ex1.Animal;

public class Lizard implements Animal {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    // cry 메서드에 대한 처리가 없다. Animal에 불필요하게 의존하고 있다.
    @Override
    public void cry() {
        // Don't call this method
    }
}