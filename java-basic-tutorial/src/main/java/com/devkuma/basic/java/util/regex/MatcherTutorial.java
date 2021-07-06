package com.devkuma.basic.java.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTutorial {

    public static void main(String[] args) {
        String regEx = "[a-z]*[a-z]";
        String text = "I never dreamed about success, I worked for it.";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
