package com.devkuma.tutorial.lombok;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoArgsConstructorTutorial {

    public NoArgsConstructorTutorial(String string) {
    }

    public static void main(String[] args) {
        new NoArgsConstructorTutorial();
    }
}
