package com.sam.inteview.epam;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int A[] = {1, 3, 6, 4, 1, 2};
        int x = solution(A);
        System.out.println(x);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int missing = 0;
        Arrays.sort(A);
         A = Arrays.stream(A).distinct().toArray();
        for (int i = 1; i <= A.length; i++) {
            if (i != A[i - 1]) {
                missing = i;
                break;
            }
            missing = i + 1;
        }
        return missing;
    }
}
