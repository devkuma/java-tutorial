package com.devkuma.basic.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class RaceAndConsume2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<Integer> initValueSupplier = () -> 100;
        Supplier<Integer> anotherValueSupplier = () -> 200;
        Function<Integer, Integer> multiply = value -> value * 2;
        Consumer<Integer> valueConsumer = value -> System.out.println(value);

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(initValueSupplier);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(anotherValueSupplier);

        future1.applyToEitherAsync(future2, multiply)
               .thenAcceptAsync(valueConsumer)
               .get();
    }
}
