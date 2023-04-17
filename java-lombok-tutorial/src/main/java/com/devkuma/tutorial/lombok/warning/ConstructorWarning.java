package com.devkuma.tutorial.lombok.warning;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ConstructorWarning {
    private String x;
    private String y;

    public static void main(String[] args) {
        ConstructorWarning warning = new ConstructorWarning("x", "y");
        System.out.println(warning);
    }
}
