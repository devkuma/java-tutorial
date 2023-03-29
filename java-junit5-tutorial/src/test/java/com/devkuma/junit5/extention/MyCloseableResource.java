package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.ExtensionContext;

public class MyCloseableResource implements ExtensionContext.Store.CloseableResource {
    private final String name;

    public MyCloseableResource(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Throwable {
        System.out.println("  Close Resource > " + this.name);
    }
}