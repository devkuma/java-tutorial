package com.devkuma.tutorial.lombok;

import lombok.NonNull;

public class NonNullTutorial {

    public static void main(String[] args) {
        method("devkuma");
        method(null);
    }

    private static void method(@NonNull String value) {
        System.out.println(value);
    }
}
