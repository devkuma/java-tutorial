package com.devkuma.algorithum.programing.acmicpc._4673;

public class Main {
    public static void main(String[] args) {
        boolean[] notSelfNumber = new boolean[10000];
        for (int i = 1; i <= 10000; i++) {

            int sum = i;
            int n = i;
            while (n != 0) {
                sum += (n % 10);
                n /= 10;
            }

            if (sum - 1 < notSelfNumber.length) {
                notSelfNumber[sum - 1] = true;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if(notSelfNumber[i] == true){
                continue;
            }
            System.out.println(i + 1);
        }
    }
}
