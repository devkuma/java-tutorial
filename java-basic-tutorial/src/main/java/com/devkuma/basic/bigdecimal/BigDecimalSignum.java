package com.devkuma.basic.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalSignum {

    public static void main(String[] args) {
        int plus = new BigDecimal(100).signum(); // 1
        int zero = new BigDecimal(0).signum(); // 0
        int minus = new BigDecimal(-100).signum(); // -1

        System.out.println(plus);
        System.out.println(zero);
        System.out.println(minus);
    }
}
