package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(MyStoreExtension.class)
class MyStoreExtensionTest {
    @Test
    void test1() throws Exception {}

    @Test
    void test2() throws Exception {}
}