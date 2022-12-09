package com.devkuma.basic.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAddAll {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("devkuma", "araikuma", "kimkc", "jiwoo");
        List<String> list2 = Arrays.asList("yun", "kim", "kuma");

        // List.addAll을 사용하여 목록을 합한다.
        List<String> newList = new ArrayList<String>();
        newList.addAll(list1);
        newList.addAll(list2);

        System.out.println(newList);
    }
}
