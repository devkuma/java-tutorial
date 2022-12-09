package com.devkuma.junit5.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class RandomOrderTest {

    @Test
    void bear() {
        System.out.println("bear");
    }

    @Test
    void ant() {
        System.out.println("ant");
    }

    @Test
    void cat() {
        System.out.println("cat");
    }

    @Test
    void dog() {
        System.out.println("dog");
    }
}
