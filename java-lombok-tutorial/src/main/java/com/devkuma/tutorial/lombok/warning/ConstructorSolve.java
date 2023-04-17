package com.devkuma.tutorial.lombok.warning;

import lombok.Builder;

@Builder
public class ConstructorSolve {
    private String x;
    private String y;

    public static void main(String[] args) {
        ConstructorSolve warning = ConstructorSolve.builder()
                                                   .x("x")
                                                   .y("y")
                                                   .build();
        System.out.println(warning);
    }
}
