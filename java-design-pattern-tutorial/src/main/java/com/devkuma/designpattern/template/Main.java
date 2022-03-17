package com.devkuma.designpattern.template;

public class Main {
    public static void main(String[] args) {
        AbstractMonster slime = new Slime("슬라임");
        AbstractMonster dragon = new Dragon("드래곤");
        slime.showInfo();
        dragon.showInfo();
    }
}