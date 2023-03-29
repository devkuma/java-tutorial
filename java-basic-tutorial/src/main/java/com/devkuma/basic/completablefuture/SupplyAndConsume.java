package com.devkuma.basic.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplyAndConsume {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Supplier<Integer> initValueSupplier = () -> 100;
        Consumer<Integer> valueConsumer = value -> System.out.println(value);

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(initValueSupplier)
                                                          .thenAcceptAsync(valueConsumer);

        future.get();  // 결과 가져오기
    }
}
