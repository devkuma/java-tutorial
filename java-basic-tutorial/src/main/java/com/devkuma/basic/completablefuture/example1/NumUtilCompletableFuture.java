package com.devkuma.basic.completablefuture.example1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class NumUtilCompletableFuture {

    private static AtomicInteger atomicInt = new AtomicInteger();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<Integer> supplier = () -> atomicInt.incrementAndGet();

        int result = CompletableFuture.supplyAsync(supplier)
                                      .thenApply(NumUtil::doubleNum)
                                      .get();

        System.out.println(result);
    }
}
