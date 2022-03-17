package com.devkuma.designpattern.adapter.ex1;

public class Main {
    public static void main(String[] args) {
        Student student = new HumanAdapter("devkuma", 25);
        student.showName();
        student.showAge();
    }
}