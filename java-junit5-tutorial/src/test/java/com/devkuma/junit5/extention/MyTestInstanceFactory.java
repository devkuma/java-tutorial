package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstanceFactory;
import org.junit.jupiter.api.extension.TestInstanceFactoryContext;
import org.junit.jupiter.api.extension.TestInstantiationException;
import org.junit.platform.commons.support.ReflectionSupport;

public class MyTestInstanceFactory implements TestInstanceFactory {
    @Override
    public Object createTestInstance(TestInstanceFactoryContext factoryContext, ExtensionContext extensionContext) throws TestInstantiationException {
        Class<?> testClass = factoryContext.getTestClass();
        System.out.println("===========================================");
        System.out.println("* testClass=" + testClass);
        System.out.println("* outerInstance=" + factoryContext.getOuterInstance().orElse("<empty>"));

        return factoryContext
                .getOuterInstance()
                .map(outerInstance -> {
                    Object instance = ReflectionSupport.newInstance(testClass, outerInstance);
                    System.out.println("* outerInstance [" + outerInstance.hashCode() + "]");
                    System.out.println("* testInstance [" + instance.hashCode() + "]");
                    return instance;
                })
                .orElseGet(() -> {
                    Object instance = ReflectionSupport.newInstance(testClass);
                    System.out.println("* testInstance [" + instance.hashCode() + "]");
                    return instance;
                });
    }
}
