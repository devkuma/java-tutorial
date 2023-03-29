package com.devkuma.basic.math;

public class MathSignum {
    public static void main(String[] args) {
        double plus = Math.signum(100); // 1.0
        double zero = Math.signum(0); // 0.0
        double minus = Math.signum(-100); // -1.0

        System.out.println(plus);
        System.out.println(zero);
        System.out.println(minus);
    }
}
