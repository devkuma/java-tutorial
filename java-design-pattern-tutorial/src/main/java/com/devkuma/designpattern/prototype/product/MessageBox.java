package com.devkuma.designpattern.prototype.product;

import com.devkuma.designpattern.prototype.framework.Product;

public class MessageBox implements Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    public void use(String s) {

        int length = s.getBytes().length;

        for (int i = 0; i < length + 2; i++) {
            System.out.print(decoChar);
        }

        System.out.println();
        System.out.println(decoChar + s + decoChar);

        for (int i = 0; i < length + 2; i++) {
            System.out.print(decoChar);
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
