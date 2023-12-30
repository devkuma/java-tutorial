package com.devkuma.guava.joiner;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Joiner;

public class JoinerWithKeyValueSeparator {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "tom");
        map.put("age", "20");
        String result = Joiner.on('&').withKeyValueSeparator("=").join(map);

        System.out.println(result);
    }
}
