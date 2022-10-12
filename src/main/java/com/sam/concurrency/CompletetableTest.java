package com.sam.concurrency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import static java.lang.ref.Cleaner.create;

public class CompletetableTest {
  public static void main(String[] args) {
    CompletableFuture<Stream<Integer>> future = CompletableFuture.supplyAsync(() -> create());
    future.thenApply(Stream::count)
        .thenAccept(System.out::println)
        .thenRun(() -> System.out.println("Done"));
    new HashMap<>();
    new ConcurrentHashMap<>();
  }

  public static Stream<Integer> create(){
    int[] arr = {1,2,3,4};
    return Arrays.stream(arr).boxed();
  }
}
