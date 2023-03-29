package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyStoreStopwatch implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.create("stopwatch"));
        store.put("startTime", System.currentTimeMillis());
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.create("stopwatch"));
        long startTime = store.get("startTime", long.class);

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        String displayName = context.getDisplayName();
        System.out.println("[" + displayName + "] time=" + time + " (startTime=" + startTime + ", endTime=" + endTime + ")");
    }
}