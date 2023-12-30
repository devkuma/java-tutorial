package com.devkuma.guava.splitter;

import java.util.List;

import com.google.common.base.Splitter;

public class SplitterFixedLength {
    public static void main(String[] args) {
        List list = Splitter.fixedLength(5).splitToList("abcdefghijklmn");

        System.out.println(list);
    }
}
