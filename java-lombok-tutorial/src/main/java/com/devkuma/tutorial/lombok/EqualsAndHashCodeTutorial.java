package com.devkuma.tutorial.lombok;

import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.List;

@EqualsAndHashCode
public class EqualsAndHashCodeTutorial {

    private int id = 100;
    private String value = "devkuma";
    private List<String> list = Arrays.asList("araikuma", "kimkc");

    public static void main(String[] args) {
        EqualsAndHashCodeTutorial a = new EqualsAndHashCodeTutorial();
        EqualsAndHashCodeTutorial b = new EqualsAndHashCodeTutorial();

        System.out.println("a.hash = " + a.hashCode());
        System.out.println("b.hash = " + b.hashCode());
        System.out.println(a.equals(b));
    }

}
