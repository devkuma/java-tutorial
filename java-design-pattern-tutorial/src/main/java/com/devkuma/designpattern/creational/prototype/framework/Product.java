package com.devkuma.designpattern.creational.prototype.framework;

import java.lang.Cloneable;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
