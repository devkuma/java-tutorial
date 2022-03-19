package com.devkuma.designpattern.chainofresponsibility;

public class Trouble {

    // 트러블 번호
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble " + number + "]";
    }
}