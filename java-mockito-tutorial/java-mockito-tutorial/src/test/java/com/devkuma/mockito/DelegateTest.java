package com.devkuma.mockito;

import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class DelegateTest {

    @Test
    void test() {
        HogeFunction mock = mock(HogeFunction.class, delegatesTo(new FinalClass()));

        when(mock.world()).thenReturn("mocked");

        System.out.println(mock.hello(10));
        System.out.println(mock.world());
    }

    public interface HogeFunction {
        String hello(int n);

        String world();
    }

    public final static class FinalClass {
        public String hello() {
            return "hello()";
        }

        public String hello(int n) {
            return "hello(" + n + ")";
        }

        public String world() {
            return "world()";
        }
    }
}