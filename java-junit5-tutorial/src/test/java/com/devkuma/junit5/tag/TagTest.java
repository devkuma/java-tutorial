package com.devkuma.junit5.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

    @Test
    @Tag("tag1")
    @Tag("tag3")
    void test1() {
        System.out.println("test1@(tag1, tag3)");
    }

    @Test
    @Tag("tag2")
    @Tag("tag3")
    void test2() {
        System.out.println("test2@(tag2, tag3)");
    }

    @Test
    @Tag("tag3")
    void test3() {
        System.out.println("test3@(tag3)");
    }

    @Test
    @Tag("tag4")
    void test4() {
        System.out.println("test4@(tag4)");
    }
}
