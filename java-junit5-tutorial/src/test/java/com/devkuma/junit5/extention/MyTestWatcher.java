package com.devkuma.junit5.extention;


import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class MyTestWatcher implements TestWatcher, AfterEachCallback {

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("disabled : test=" + context.getDisplayName() + ", reason=" + reason.orElse("<empty>"));
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("successful : test=" + context.getDisplayName());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        System.out.println("aborted : test=" + context.getDisplayName() + ", cause=" + cause);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("failed : test=" + context.getDisplayName() + ", cause=" + cause);
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("AfterEachCallback");
    }
}
