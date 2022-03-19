package com.devkuma.designpattern.flyweight;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1234");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}