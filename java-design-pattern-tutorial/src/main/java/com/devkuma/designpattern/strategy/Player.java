package com.devkuma.designpattern.strategy;

public class Player {

    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        winCount++;
        gameCount++;
    }

    public void lose() {
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    public String toString() {
        return "[" + name + "] " + gameCount + " games, " + winCount + " win, " + loseCount + " lose";
    }
}
