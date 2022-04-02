package com.devkuma.basic.generics.ex2;

public class GenericsSample {

    public static void main(String[] args) {
        GenericsClassSample<String> classSample = new GenericsClassSample();
        classSample.setT("SetItem");
        String getItem = classSample.getT();
    }
}