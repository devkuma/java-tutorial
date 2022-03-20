package com.devkuma.designpattern.behavioral.template;

public class Slime extends AbstractMonster {

    public Slime(String name) {
        this.name = name;
    }

    public int getAttack() {
        return 15;
    }

    public int getDefense() {
        return 10;
    }
}