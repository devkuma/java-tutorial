package com.devkuma.algorithum.programing.basic;

public class Min {
    int min(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Min min = new Min();

        int[] nums = {1, 4, 3, 8, 5};
        System.out.println("최소값:" + min.min(nums));
    }
}