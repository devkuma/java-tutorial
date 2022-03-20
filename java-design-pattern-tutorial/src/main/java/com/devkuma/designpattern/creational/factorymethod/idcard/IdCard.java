package com.devkuma.designpattern.creational.factorymethod.idcard;

import com.devkuma.designpattern.creational.factorymethod.framwork.Product;

public class IdCard extends Product {

    private String owner;

    IdCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
