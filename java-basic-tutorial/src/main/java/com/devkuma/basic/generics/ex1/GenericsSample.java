package com.devkuma.basic.generics.ex1;

import java.util.ArrayList;
import java.util.List;

public class GenericsSample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("test");

        String test = arrayList.get(0); // ok
    }
}