package com.devkuma.tutorial.lombok;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
@Builder
@ToString
public class SingularTutorial {

    private String string;
    private int number;
    @Singular("list")
    private List<String> list;

    public static void main(String[] args) {
        SingularTutorialBuilder builder = SingularTutorial.builder()
                .string("test")
                .number(100)
                .list("kimkc")
                .list("happykuma")
                .list(Arrays.asList("devkuma", "araikuma"));

        SingularTutorial tutorial = builder.build();

        System.out.println(tutorial);
    }

}
