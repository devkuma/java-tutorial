package com.devkuma.basic.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalArithmetic {
    public static void main(String[] args) {
        // BigDecimal 생성
        BigDecimal one = new BigDecimal("1.00");
        BigDecimal two = new BigDecimal("2.00");
        BigDecimal three = new BigDecimal("3.00");

        // 더하기 ( 1.0 + 2.0 )
        BigDecimal add = one.add(two);

        // 빼기 ( 1.0 - 2.0）
        BigDecimal subtract = one.subtract(two);

        // 곱하기 ( 2.0 * 3.0 )
        BigDecimal multiply = two.multiply(three);

        // 나누기 ( 1.0 / 3.0 소수 2자리 수를 반올림한다 )
        BigDecimal divide = one.divide(three, 2, RoundingMode.HALF_UP);

        System.out.println("더하기: " + add);
        System.out.println("빼기 : " + subtract);
        System.out.println("곱하기: " + multiply);
        System.out.println("나누기: " + divide);
    }
}
