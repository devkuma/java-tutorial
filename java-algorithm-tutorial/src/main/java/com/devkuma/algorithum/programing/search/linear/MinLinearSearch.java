package com.devkuma.algorithum.programing.search.linear;

public class MinLinearSearch {

    void searchMinimum(int[] nums) {
        int minValue = Integer.MAX_VALUE; // 최대값
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        System.out.println("최소값은 " + minValue + "입니다.");
    }

    public static void main(String[] args) {
        MinLinearSearch search = new MinLinearSearch();
        search.searchMinimum(new int[]{1, 5, 3, 2, 8, 9});
        search.searchMinimum(new int[]{2, 7, 8, 6, 5, 4});
    }
}