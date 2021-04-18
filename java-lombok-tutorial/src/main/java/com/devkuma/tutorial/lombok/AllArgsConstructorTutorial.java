package com.devkuma.tutorial.lombok;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AllArgsConstructorTutorial {
    private String string;
    private int number;

    public static void main(String[] args) {
        new AllArgsConstructorTutorial("devkuma", 999);
    }
}
