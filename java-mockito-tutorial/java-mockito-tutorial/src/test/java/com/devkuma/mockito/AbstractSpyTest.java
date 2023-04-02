package com.devkuma.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;

public class AbstractSpyTest {

    @Test
    void test() {
        AbstractClass mock = spy(AbstractClass.class);
        System.out.println("mock.concreteMethod()       = " + mock.concreteMethod());
        System.out.println("mock.abstractStringMethod() = " + mock.abstractStringMethod());
    }

    public static abstract class AbstractClass {

        public String concreteMethod() {
            return "concreteMethod";
        }

        abstract public String abstractStringMethod();
    }
}