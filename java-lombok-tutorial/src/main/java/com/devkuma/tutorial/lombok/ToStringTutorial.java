package com.devkuma.tutorial.lombok;

import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@ToString(exclude="ignore")
public class ToStringTutorial {

    private int id = 100;
    private String value = "devkuma";
    private List<String> list = Arrays.asList("araikuma", "kimkc");
    private double ignore = 999;

    public static void main(String[] args) {
        System.out.println(new ToStringTutorial());
    }
}
