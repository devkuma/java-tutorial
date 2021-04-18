package com.devkuma.tutorial.lombok;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName="of")
public class StaticFactoryOfTututorial {

    private final String required;
    private int optional;

    public static void main(String[] args) {
        StaticFactoryOfTututorial tututorial = StaticFactoryOfTututorial.of("devkuma");
    }
}
