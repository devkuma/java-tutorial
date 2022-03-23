package com.devkuma.designpattern.behavioral.interpreter;

public abstract class Node {
    public abstract void parse(Context context) throws Exception;
}
