package com.devkuma.tutorial.lombok;

import lombok.SneakyThrows;

import java.io.IOException;

public class SneakyThrowsTutorial2 {
    public static void main(String[] args) {
        method();
    }

    @SneakyThrows(IOException.class)
    private static void method() {
        try {
            throw new Exception("test");
        } catch (Exception e) {
            // catch가 없으면 에러가 발생한다.
        }

        throw new IOException();
    }
}
