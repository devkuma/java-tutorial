package com.devkuma.basic.completablefuture.example1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class NumUtilFuture {

    private static AtomicInteger atomicInt = new AtomicInteger();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = () -> atomicInt.incrementAndGet();

        Future<Integer> future = executor.submit(callable);
        int num = future.get();
        int result = NumUtil.doubleNum(num);

        System.out.println(result);

        executor.shutdown();
    }
}
