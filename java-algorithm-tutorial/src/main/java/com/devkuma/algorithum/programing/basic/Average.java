package com.devkuma.algorithum.programing.basic;

public class Average {
    int average(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    public static void main(String[] args) {
        Average average = new Average();

        int[] nums = {1, 4, 3, 8, 5};
        System.out.println("평균:" + average.average(nums));
    }
}
