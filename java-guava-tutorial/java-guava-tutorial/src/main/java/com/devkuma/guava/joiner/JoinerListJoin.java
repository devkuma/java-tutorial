package com.devkuma.guava.joiner;

import com.google.common.base.Joiner;

public class JoinerListJoin {
    public static void main(String[] args) {
        String[] values = {"abc", "def", "ghi"};
        String result = Joiner.on(',').join(values);

        System.out.println(result);
    }
}
