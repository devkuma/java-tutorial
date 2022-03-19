package com.devkuma.designpattern.visitor;

public abstract class Entry implements Element {

    public abstract String getName();

    public String toString() {
        return getName();
    }
}