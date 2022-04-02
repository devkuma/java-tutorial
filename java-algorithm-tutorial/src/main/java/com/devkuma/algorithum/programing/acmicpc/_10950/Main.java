package com.devkuma.algorithum.programing.acmicpc._10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 반복문을 몇 번 수행할지 정한다.
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // 반복문 실행
        for (int i = 0; i < input; i++) {
            // 결과 값을 출력해줄 변수 선언
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
