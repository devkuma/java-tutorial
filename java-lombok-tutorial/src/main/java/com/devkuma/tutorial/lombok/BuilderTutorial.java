package com.devkuma.tutorial.lombok;

import lombok.Builder;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@Builder
@ToString
public class BuilderTutorial {

    private String string;
    private int number;
    private List<String> list;

    public static void main(String[] args) {
        BuilderTutorialBuilder builder = BuilderTutorial.builder()
                .string("builder")
                .number(100)
                .list(Arrays.asList("kimkc", "happykuma"))
                .list(Arrays.asList("devkuma", "araikuma"));

        BuilderTutorial tutorial = builder.build();

        System.out.println(tutorial);
    }
}
