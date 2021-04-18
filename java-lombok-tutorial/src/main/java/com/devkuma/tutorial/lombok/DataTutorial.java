package com.devkuma.tutorial.lombok;

import lombok.Data;

@Data
public class DataTutorial {
    public static void main(String[] args) {
        DataTutorial a = new DataTutorial("devkuma");
        a.setNumber(300);

        DataTutorial b = new DataTutorial("devkuma");
        b.setNumber(300);

        System.out.println("a = " + a);
        System.out.println(a.equals(b));
    }

    private final String required;
    private int number;
}
