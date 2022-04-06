package com.devkuma.basic.statickeyword.ex1;

public class StudentSample2 {

    public static void main(String[] args) {
        Student devkuma = new Student("devkuma");
        Student araikuma = new Student("araikuma");
        Student kimkc = new Student("kimkc");

        System.out.println(devkuma.number++);
        System.out.println(araikuma.number++);
        System.out.println(kimkc.number);
    }
}
