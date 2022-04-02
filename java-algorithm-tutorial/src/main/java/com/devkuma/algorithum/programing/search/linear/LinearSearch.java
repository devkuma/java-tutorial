package com.devkuma.algorithum.programing.search.linear;

public class LinearSearch {

    void search(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i + 1;
                break;
            }
        }
        if (index > 0) {
            System.out.println(target + "은 " + index + "번째 있습니다.");
        } else {
            System.out.println(target + "은 없습니다.");
        }
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        search.search(new int[]{1, 5, 3, 2, 8, 9}, 8);
        search.search(new int[]{1, 5, 3, 2, 8, 9}, 4);
    }
}
