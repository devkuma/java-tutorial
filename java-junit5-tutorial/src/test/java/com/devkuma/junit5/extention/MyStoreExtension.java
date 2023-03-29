package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.*;

public class MyStoreExtension implements BeforeAllCallback, BeforeEachCallback, AfterEachCallback, AfterAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("[beforeAll]");
        this.printStoreValues(context);

        ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.create("foo"));
        store.put("hoge", "INITIAL VALUE");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("[beforeEach@" + context.getDisplayName() + "]");
        this.printStoreValues(context);

        ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.create("foo"));
        store.put("hoge", context.getDisplayName());
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("[afterEach@" + context.getDisplayName() + "]");
        this.printStoreValues(context);
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("[afterAll]");
        this.printStoreValues(context);
    }

    private void printStoreValues(ExtensionContext context) {
        ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.create("foo"));
        System.out.println("  hoge=" + store.get("hoge"));
        System.out.println("  context.class=" + context.getClass().getCanonicalName());
    }
}
