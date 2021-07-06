package com.devkuma.basic.bigo;

public class BigoTutorial {

    public static void basic() {
        int[] a = {7, 3, 6, 3, 3, 5, 6, 9};          // 1
        for (int i = 0; i < a.length - 1; i++) {     // n             [i > 0 to n-1 : n times called]
            for (int j = i + 1; j < a.length; j++) { // (n-1) * n     [j > 1 to n   : n times called]
                if (a[i] == a[j]) {                  // (n-1) * (n-1) [if 문은 결국 n-1 번만 실행 ]
                    a[j] = 0;
                }
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int factorial(int n) {
        System.out.println("n:" + n);
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("## 기본 계산법 ########################");
        basic();

        System.out.println("## 재귀함수 시간 복잡도 계산법#############");
        factorial(10);
    }
}
