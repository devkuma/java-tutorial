package com.devkuma.designpattern.visitor;

public interface Element {
    void accept(Visitor visitor);
}
