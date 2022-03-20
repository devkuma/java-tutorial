package com.devkuma.designpattern.creational.prototype.product;

import com.devkuma.designpattern.creational.prototype.framework.Product;

public class UnderlinePen implements Product {

    private char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    public void use(String s) {

        int length = s.getBytes().length;

        System.out.println(s);

        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }

        System.out.println();
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            // 객체의 클래스가 Cloneable 인터페이스를 구현하고 있지 않은 경우에 Throw되는 예외
            e.printStackTrace();
        }
        return p;
    }
}
