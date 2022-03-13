package com.devkuma.designpattern.prototype.framework;

import java.util.HashMap;

public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = (Product) showcase.get(prototypeName);
        return p.createClone();
    }
}
