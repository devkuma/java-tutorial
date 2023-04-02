package com.devkuma.mockito;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DefaultReturnValueTest {

    @Test
    void test() {
        MockTest mock = mock(MockTest.class);

        System.out.println("mock.primitive()        = " + mock.primitive());
        System.out.println("mock.primitiveWrapper() = " + mock.primitiveWrapper());
        System.out.println("mock.collection()       = " + mock.collection());
        System.out.println("mock.array()            = " + mock.array());
        System.out.println("mock.anyObject()        = " + mock.anyObject());
    }

    public class MockTest {

        public int primitive() {
            return 1;
        }

        public Integer primitiveWrapper() {
            return 2;
        }

        public int[] array() {
            return new int[] { 1, 2, 3 };
        }

        public List<String> collection() {
            return List.of("hello", "world");
        }

        public String anyObject() {
            System.out.println("Hello World");
            return "Hello World";
        }
    }
}
