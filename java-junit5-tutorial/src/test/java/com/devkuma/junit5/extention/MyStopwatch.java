package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyStopwatch implements BeforeEachCallback, AfterEachCallback {

    private long startTime;

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        String displayName = context.getDisplayName();
        long endTime = System.currentTimeMillis();
        long time = endTime - this.startTime;
        System.out.println("[" + displayName + "] time=" + time + " (startTime=" + this.startTime + ", endTime=" + endTime + ")");
    }
}