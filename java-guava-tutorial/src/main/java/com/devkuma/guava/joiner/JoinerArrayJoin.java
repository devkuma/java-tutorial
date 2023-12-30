package com.devkuma.guava.joiner;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;

public class JoinerArrayJoin {
    public static void main(String[] args) {
        List values = new ArrayList();
        values.add("abc");
        values.add("def");
        values.add("ghi");
        String result = Joiner.on(',').join(values);

        System.out.println(result);
    }
}
