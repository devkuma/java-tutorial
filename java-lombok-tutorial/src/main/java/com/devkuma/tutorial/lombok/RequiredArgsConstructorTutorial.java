package com.devkuma.tutorial.lombok;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredArgsConstructorTutorial {
    private String optional;
    private final int required;

    public static void main(String[] args) {
        new RequiredArgsConstructorTutorial(1);
    }
}
