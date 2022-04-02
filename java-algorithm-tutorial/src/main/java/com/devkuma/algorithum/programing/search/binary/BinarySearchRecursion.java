package com.devkuma.algorithum.programing.search.binary;

public class BinarySearchRecursion {

    int search(int arr[], int target, int startIndex, int endIndex) {
        if (startIndex > endIndex)
            return -1;

        int middle = (startIndex + endIndex) / 2;
        if (arr[middle] == target)
            return middle;
        else if (arr[middle] > target)
            return search(arr, target, startIndex, middle - 1);
        else
            return search(arr, target, middle + 1, endIndex);
    }

    public static void main(String[] args) {
        BinarySearchRecursion search = new BinarySearchRecursion();

        int[] nums = {15, 28, 65, 67, 88, 92, 100, 150};
        int target = 28;
        int startIndex = 0;
        int endIndex = nums.length - 1;

        int index = search.search(nums, target, startIndex, endIndex);

        if (index > 0) {
            System.out.println(target + "은 " + index + "번째 있습니다.");
        } else {
            System.out.println(target + "은 없습니다.");
        }
    }
}