package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyCloseableResourceExtension  implements BeforeEachCallback, BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        MyCloseableResource resource = new MyCloseableResource("BeforeAll");
        context.getStore(ExtensionContext.Namespace.GLOBAL).put("foo", resource);
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        MyCloseableResource resource = new MyCloseableResource("BeforeEach(" + context.getDisplayName() + ")");
        context.getStore(ExtensionContext.Namespace.GLOBAL).put("foo", resource);
    }
}