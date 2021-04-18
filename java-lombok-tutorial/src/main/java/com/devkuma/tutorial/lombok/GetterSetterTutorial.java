package com.devkuma.tutorial.lombok;

import lombok.Getter;
import lombok.Setter;

public class GetterSetterTutorial {

    @Getter
    @Setter
    private String value;

    public static void main(String[] args) {
        GetterSetterTutorial tutorial = new GetterSetterTutorial();

        tutorial.setValue("Hello @Getter, @Setter");
        System.out.println(tutorial.getValue());
    }

}
