package com.devkuma.basic.generics.ex4;

public class GenericClassSample<T extends Number>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}