package com.devkuma.algorithum.programing.basic;

public class Sum {

    int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();

        int[] nums = {1, 4, 3,  8, 5};
        System.out.println("합계: " + sum.sum(nums));
    }
}