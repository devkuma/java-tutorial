package com.devkuma.basic.collection.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {
        // 배열 생성
        String[] array = new String[3];
        array[0] = "Test1";
        array[1] = "Test2";
        array[2] = "Test3";

        // 배열을 List로 변환
        List<String> list = new ArrayList<>(Arrays.asList(array));

        // List 표시
        for (String value : list) {
            System.out.println(value);
        }
    }
}
