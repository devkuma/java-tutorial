package com.devkuma.designpattern.factorymethod;

import com.devkuma.designpattern.factorymethod.framwork.Factory;
import com.devkuma.designpattern.factorymethod.framwork.Product;
import com.devkuma.designpattern.factorymethod.idcard.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("devkuma");
        Product card2 = factory.create("kimkc");
        Product card3 = factory.create("yunho");
        card1.use();
        card2.use();
        card3.use();
    }
}
