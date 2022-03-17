package com.devkuma.designpattern.bridge;

public class Main {

    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Display Test"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("CountDisplay Test"));
        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("RandomCountDisplay Test"));
        display.display();
        countDisplay.multiDisplay(5);
        randomCountDisplay.randomDisplay(10);
    }
}
