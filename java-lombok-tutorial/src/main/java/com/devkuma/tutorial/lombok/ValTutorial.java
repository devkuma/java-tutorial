package com.devkuma.tutorial.lombok;

import lombok.val;

import java.util.Arrays;
import java.util.HashMap;

public class ValTutorial {

    public static void main(String... args) {
        val list = Arrays.asList("devkuma", "araikuma", "kimkc");
        list.forEach(System.out::println);

        val map = new HashMap<String, Long>();
        map.put("hoge", 1L);

        // map = null;
    }
}
