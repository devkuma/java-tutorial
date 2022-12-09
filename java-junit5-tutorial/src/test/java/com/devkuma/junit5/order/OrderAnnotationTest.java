package com.devkuma.junit5.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationTest {

    @Test
    @Order(3)
    void bear() {
        System.out.println("bear");
    }

    @Test
    @Order(4)
    void ant() {
        System.out.println("ant");
    }

    @Test
    @Order(2)
    void cat() {
        System.out.println("cat");
    }

    @Test
    @Order(1)
    void dog() {
        System.out.println("dog");
    }
}
