package com.devkuma.tutorial.lombok;

import lombok.Getter;

public class GetterLazyTutorial {
    public static void main(String[] args) {
        GetterLazyTutorial tutorial = new GetterLazyTutorial();
        System.out.println("Main instance is created");
        tutorial.getLazy();
    }

    @Getter
    private final String notLazy = createValue("not lazy");

    @Getter(lazy=true)
    private final String lazy = createValue("lazy");

    private String createValue(String name) {
        System.out.println("createValue(" + name + ")");
        return null;
    }
}
