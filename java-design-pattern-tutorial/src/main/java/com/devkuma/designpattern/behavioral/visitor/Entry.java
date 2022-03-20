package com.devkuma.designpattern.behavioral.visitor;

public abstract class Entry implements Element {

    public abstract String getName();

    public String toString() {
        return getName();
    }
}