package com.devkuma.tutorial.lombok;

import lombok.Data;

@Data
public class HelloLombokTutorial {

    private String string;
    private int number;

    public static void main(String[] args) {
        HelloLombokTutorial tutorial = new HelloLombokTutorial();

        tutorial.setString("Hello Lombok!!");
        tutorial.setNumber(999);

        System.out.println(tutorial);
    }
}
