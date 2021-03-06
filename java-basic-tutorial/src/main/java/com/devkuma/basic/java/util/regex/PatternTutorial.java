package com.devkuma.basic.java.util.regex;

import java.util.regex.Pattern;

public class PatternTutorial {
    public static void main(String[] args) {

        String regex = "[0-9]*$"; //숫자만

        String input1 = "0123456789"; //입력 문자열
        System.out.println(Pattern.matches(regex, input1));

        String input2 = "abcde56789"; //입력 문자열
        System.out.println(Pattern.matches(regex, input2));

        String input3 = "abcdefghij"; //입력 문자열
        System.out.println(Pattern.matches(regex, input3));
    }
}
