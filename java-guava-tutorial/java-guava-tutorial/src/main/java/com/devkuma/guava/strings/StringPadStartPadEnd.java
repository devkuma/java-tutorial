package com.devkuma.guava.strings;

import com.google.common.base.Strings;

public class StringPadStartPadEnd {
    public static void main(String[] args) {
        // padStart
        System.out.println(Strings.padStart("123", 5, '0'));

        // padEnd
        System.out.println(Strings.padEnd("123", 5, '0'));
    }
}
