package com.devkuma.mockito;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class SpyTest {

    @Test
    void test() {
        Hoge hoge = new Hoge();
        Hoge spy = spy(hoge);

        when(spy.size()).thenReturn(100);

        spy.add("hello");
        spy.add("world");
        spy.setName("Spied!");

        System.out.println("spy       = " + spy);
        System.out.println("spy.size  = " + spy.size());
        System.out.println("hoge      = " + hoge);
        System.out.println("hoge.size = " + hoge.size());

        try {
            spy.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Hoge implements Cloneable {
        private List<String> list = new ArrayList<>();
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void add(String value) {
            list.add(value);
        }

        public int size() {
            return list.size();
        }

        @Override
        public String toString() {
            return "Hoge{" + "list=" + list + ", name='" + name + '\'' + '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    @Test
    void testStubbingSpyWithError() {
        List<String> list = new ArrayList<>();
        List<String> spy = spy(list);

        when(spy.get(0)).thenReturn("spied");

        System.out.println("spy.get(0) = " + spy.get(0));
    }

    @Test
    void testStubbingSpyNoError() {
        List<String> list = new ArrayList<>();
        List<String> spy = spy(list);

        doReturn("spied").when(spy).get(0);

        System.out.println("spy.get(0) = " + spy.get(0));
    }

    @Test
    void testStubbingMockError() {
        List<String> mock = mock(List.class);
        doReturn(10).when(mock).get(0);

        System.out.println("mock.get(0) = " + mock.get(0));
    }
}