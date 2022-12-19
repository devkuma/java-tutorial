package com.devkuma.basic.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounding {

    public static void main(String[] args) {
        // BigDecimal 생성
        BigDecimal value = new BigDecimal(123.455);

        BigDecimal roundCeiling = value.setScale(2, RoundingMode.CEILING);
        BigDecimal roundDown = value.setScale(2, RoundingMode.DOWN);
        BigDecimal roundFloor = value.setScale(2, RoundingMode.FLOOR);
        BigDecimal roundHalfDown = value.setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal roundHalfEven = value.setScale(2, RoundingMode.HALF_UP);
        BigDecimal roundUp = value.setScale(2, RoundingMode.UP);

        System.out.println("RoundingMode.CEILING: " + roundCeiling);
        System.out.println("RoundingMode.DOWN :" + roundDown);
        System.out.println("RoundingMode.FLOOR :" + roundFloor);
        System.out.println("RoundingMode.HALF_DOWN :" + roundHalfDown);
        System.out.println("RoundingMode.HALF_UP :" + roundHalfEven);
        System.out.println("RoundingMode.UP :" + roundUp);
    }
}
