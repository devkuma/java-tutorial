package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.*;

import java.util.List;
import java.util.stream.Stream;

public class MyTestTemplateInvocationContextProvider implements TestTemplateInvocationContextProvider {
    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        System.out.println("[supportsTestTemplate] displayName=" + context.getDisplayName());
        return context.getDisplayName().equals("test1()");
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        System.out.println("[provideTestTemplateInvocationContexts] displayName=" + context.getDisplayName());
//        return Stream.of(
//                new MyTestTemplateInvocationContext("testName1"),
//                new MyTestTemplateInvocationContext("testName2"),
//                new MyTestTemplateInvocationContext("testName3")
//        );
        return Stream.of(
                new MyTestTemplateInvocationContext("BeforeEach", (BeforeEachCallback) ctx -> {
                    System.out.println("beforeEachCallback()");
                }),
                new MyTestTemplateInvocationContext("AfterEach", (AfterEachCallback) ctx -> {
                    System.out.println("afterEachCallback()");
                })
        );
    }

    public static class MyTestTemplateInvocationContext implements TestTemplateInvocationContext {
        private final String name;
        private final Extension extension;

        public MyTestTemplateInvocationContext(String name,  Extension extension) {
            this.name = name;
            this.extension = extension;
        }

//        @Override
//        public String getDisplayName(int invocationIndex) {
//            return this.name + "[" + invocationIndex + "]";
//        }

        @Override
        public String getDisplayName(int invocationIndex) {
            return this.name;
        }

        @Override
        public List<Extension> getAdditionalExtensions() {
            return List.of(this.extension);
        }
    }
}