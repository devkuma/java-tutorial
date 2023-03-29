package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.*;

public class MyLifeCycleCallback
        implements BeforeAllCallback,
        BeforeEachCallback,
        BeforeTestExecutionCallback,
        AfterTestExecutionCallback,
        AfterEachCallback,
        AfterAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("BeforeAllCallback");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("    BeforeEachCallback");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("        BeforeTestExecutionCallback");
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("        AfterTestExecutionCallback");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("    AfterEachCallback");
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("AfterAllCallback");
    }
}
