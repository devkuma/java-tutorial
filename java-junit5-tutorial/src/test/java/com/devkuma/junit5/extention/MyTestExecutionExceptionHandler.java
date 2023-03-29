package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class MyTestExecutionExceptionHandler implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println(" * throwable=" + throwable);
        if (throwable instanceof NullPointerException) {
            throw throwable;
        } else if (throwable instanceof IllegalStateException) {
            throw new UnsupportedOperationException("test");
        }
    }
}