package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyRegisterExtension implements BeforeEachCallback, BeforeAllCallback {
    private final String name;

    public MyRegisterExtension(String name) {
        this.name = name;
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("[" + this.name + "] beforeAll()");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("[" + this.name + "] beforeEach()");
    }
}
