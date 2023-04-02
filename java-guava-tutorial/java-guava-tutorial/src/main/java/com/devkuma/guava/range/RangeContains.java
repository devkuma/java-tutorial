package com.devkuma.guava.range;

import com.google.common.collect.Range;

public class RangeContains {

    public static void main(String[] args) {
        Range<Integer> range = Range.closed(1, 10); //open 은 등호 제외  1 < x < 10

        int target = 3;

        if (range.contains(target)) { // if (target >= 1 && target <= 10)
            System.out.println("1 ~ 10 범위");
        }
    }
}
