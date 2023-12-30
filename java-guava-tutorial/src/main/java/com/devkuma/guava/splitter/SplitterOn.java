package com.devkuma.guava.splitter;

import java.util.List;

import com.google.common.base.Splitter;

public class SplitterOn {

    public static void main(String[] args) {
        List list = Splitter.on(',').splitToList("devkuma,araikuma,kimkc");

        System.out.println(list);
    }
}
