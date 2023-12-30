package com.devkuma.guava.strings;

import com.google.common.base.Strings;

public class StringIsNullOrEmpty {
    public static void main(String[] args) {
        System.out.println(Strings.isNullOrEmpty(null)); // "true"가 반환된다.
        System.out.println(Strings.isNullOrEmpty(""));   // "true"가 반환된다.
        System.out.println(Strings.isNullOrEmpty("a"));  // "false"가 반환된다.
        System.out.println(Strings.isNullOrEmpty(" "));  // "false"가 반환된다.
    }
}
