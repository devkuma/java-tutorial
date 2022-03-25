package com.devkuma.tutorial.solid.lsp.good;

import com.devkuma.tutorial.solid.lsp.Animal;

public class Dog extends Animal {

    void bark() {
        System.out.println("bow-wow");
    }

    void run(Integer speed) {
        System.out.println("running at " + speed + " km/h");
    }
}
