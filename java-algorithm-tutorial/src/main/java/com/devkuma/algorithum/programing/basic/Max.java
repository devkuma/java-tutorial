package com.devkuma.algorithum.programing.basic;

public class Max {
    int max(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Max max = new Max();

        int[] nums = {1, 4, 3, 8, 5};
        System.out.println("최대값:" + max.max(nums));
    }
}