package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.LifecycleMethodExecutionExceptionHandler;

public class MyLifecycleMethodExecutionExceptionHandler implements LifecycleMethodExecutionExceptionHandler {

    @Override
    public void handleBeforeEachMethodExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println("[LifecycleMethodExecutionExceptionHandler] throwable=" + throwable);
        throw throwable;
    }

    @Override
    public void handleAfterEachMethodExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println("[LifecycleMethodExecutionExceptionHandler] throwable=" + throwable);
    }
}