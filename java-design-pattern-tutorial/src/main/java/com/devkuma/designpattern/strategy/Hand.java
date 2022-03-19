package com.devkuma.designpattern.strategy;

public class Hand {

    public static final int HAND_VALUE_ROCK = 0; // 바위
    public static final int HAND_VALUE_SCISSORS = 1; // 가위
    public static final int HAND_VALUE_PAPER = 2; // 보

    public static final Hand[] hand = {
            new Hand(HAND_VALUE_ROCK),
            new Hand(HAND_VALUE_SCISSORS),
            new Hand(HAND_VALUE_PAPER),
    };

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        // this가 hand보다 강했을 때 true
        return fight(hand) == 1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            // 무승부
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            // this의 승리
            return 1;
        } else {
            // hand의 승리
            return -1;
        }
    }
}