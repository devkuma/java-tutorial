package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyExtension implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("MyExtension.beforeEach()");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("MyExtension.afterEach()");
    }
}