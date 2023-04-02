package com.devkuma.guava.splitter;

import java.util.Map;

import com.google.common.base.Splitter;

public class SplitterWithKeyValueSeparator {

    public static void main(String[] args) {
        Map<String, String> map = Splitter.on("&").trimResults().withKeyValueSeparator('=').split("name=devkuma&age=20");

        System.out.println(map);
    }
}
