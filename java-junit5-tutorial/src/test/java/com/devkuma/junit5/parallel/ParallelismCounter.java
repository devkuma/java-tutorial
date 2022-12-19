package com.devkuma.junit5.parallel;

import java.util.concurrent.atomic.AtomicInteger;

public class ParallelismCounter {
    private final AtomicInteger counter = new AtomicInteger(0);
    private final AtomicInteger max = new AtomicInteger(0);

    public void increment() {
        this.max.set(Math.max(this.max.get(), this.counter.incrementAndGet()));
    }

    public void decrement() {
        this.counter.decrementAndGet();
    }

    public int getMaxCount() {
        return this.max.get();
    }
}