package com.devkuma.designpattern.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
