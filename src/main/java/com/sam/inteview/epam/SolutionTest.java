package com.sam.inteview.epam;

import java.time.Instant;
import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) throws InterruptedException {
        TimeProvider time = () -> Instant.now().toEpochMilli();
        CachingDataStructure cache = new CachingDataStructure(time,3);
        cache.put("1", "one", 2000L);
        cache.put("2", "two", 1000L);
        Thread.sleep(3000);
        cache.put("3", "three", 300000L);
        cache.put("4", "four", 400000L);
        System.out.println(cache.get("1"));
        System.out.println(cache.map);
        System.out.println(cache.queue);
    }

    public static int solution(int[] A) {
        // write your code in Java 8
        int sum = 0;
        sum = Arrays.stream(A).distinct().sum();
        return sum;
    }
}
