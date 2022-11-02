package com.sam.inteview.epam;

import java.util.Arrays;

public class SolutionTest1 {
    public static void main(String[] args) {
        int A[] = {5,120,-2,11,120,2};
        int x = solution(A);
        System.out.println("sum =" + x);
    }

    public static int solution(int[] A) {
        // write your code in Java 8
        int sum = 0;
        sum = Arrays.stream(A).distinct().sum();
        return sum;
    }
}
