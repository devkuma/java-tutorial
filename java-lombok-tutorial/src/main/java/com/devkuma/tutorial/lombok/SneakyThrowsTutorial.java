package com.devkuma.tutorial.lombok;

import lombok.SneakyThrows;

public class SneakyThrowsTutorial {
    public static void main(String[] args) {
        method();
    }

    @SneakyThrows
    private static void method() {
        throw new Exception("test");
    }
}
