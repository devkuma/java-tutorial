package com.devkuma.designpattern.behavioral.strategy;

public class RockStrategy implements Strategy {

    public Hand nextHand() {
        return Hand.getHand(Hand.HAND_VALUE_ROCK);
    }
}