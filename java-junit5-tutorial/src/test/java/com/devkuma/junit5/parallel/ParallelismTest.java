package com.devkuma.junit5.parallel;

import org.junit.jupiter.api.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelismTest {
    private long begin;
    private ParallelismCounter counter = new ParallelismCounter();

    @BeforeEach
    void beforeEach() {
        begin = System.currentTimeMillis();
    }

    @TestFactory
    Stream<DynamicNode> testFactory() {
        return IntStream
                .range(0, 20)
                .mapToObj(i -> DynamicTest.dynamicTest("test" + i, () -> {
                    counter.increment();
                    Thread.sleep(1000);
                    counter.decrement();
                }));
    }

    @AfterEach
    void printThreadNames() {
        System.out.println(System.currentTimeMillis() - begin + "ms");
        System.out.println("Available Processors = " + Runtime.getRuntime().availableProcessors());
        System.out.println("Max Parallelism Count = " + counter.getMaxCount());
        System.out.println("Active Thread Count = " + Thread.activeCount());
        Thread[] activeThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(activeThreads);
        IntStream.range(0, activeThreads.length)
                .mapToObj(i -> "[" + i + "] " + activeThreads[i].getName())
                .forEach(System.out::println);
    }
}