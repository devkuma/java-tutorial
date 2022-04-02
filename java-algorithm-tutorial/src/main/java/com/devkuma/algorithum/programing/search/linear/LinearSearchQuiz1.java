package com.devkuma.algorithum.programing.search.linear;

public class LinearSearchQuiz1 {

    void minSum(int[] aNums, int[] bNums, int r) {
        int minSum = Integer.MAX_VALUE; // 최대값
        for(int i = 0; i < aNums.length; i++) {
            for(int j = 0; j < bNums.length; j++) {
                int sum = aNums[i] + bNums[j];
                if (sum >= r && minSum > sum) {
                    minSum = sum;
                }
            }
        }
        System.out.println("최소값은 " + minSum + "입니다.");
    }

    public static void main(String[] args) {
        LinearSearchQuiz1 search = new LinearSearchQuiz1();

        int[] aNums =   new int[]{9, 5, 3, 7, 8, 9};
        int[] bNums =   new int[]{3, 9, 5, 8, 3, 5};
        int r = 7;
        search.minSum(aNums, bNums, 7);
    }
}