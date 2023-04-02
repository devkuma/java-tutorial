package com.devkuma.guava.joiner;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;

public class JoinerSkipNullsJoin {
    public static void main(String[] args) {
        List values = new ArrayList();
        values.add("abc");
        values.add(null);
        values.add("ghi");
        String result = Joiner.on(',').skipNulls().join(values);

        System.out.println(result);
    }
}
