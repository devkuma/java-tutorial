package com.devkuma.algorithum.programing.search.binary;

public class BinarySearchWhile {

    int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        int middle = 1;

        while (startIndex <= endIndex) {
            middle = (startIndex + endIndex) / 2;
            if (nums[middle] == target)
                return middle + 1;
            else if (nums[middle] > target)
                endIndex = middle - 1;
            else
                startIndex = middle + 1;
        }
        return middle;
    }

    public static void main(String[] args) {
        BinarySearchWhile search = new BinarySearchWhile();

        int[] nums = {15, 28, 65, 67, 88, 92, 100, 150};
        int target = 28;
        int index = search.search(nums, target);

        if (index > 0) {
            System.out.println(target + "은 " + index + "번째 있습니다.");
        } else {
            System.out.println(target + "은 없습니다.");
        }
    }
}