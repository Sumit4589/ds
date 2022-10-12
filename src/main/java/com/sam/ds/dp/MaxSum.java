package com.sam.ds.dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxSum {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int wSize = 2;
    int maxSum = maxSum(arr, wSize, arr.length);
    System.out.println(maxSum);
    Long maxSum2 = Arrays.stream(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .limit(2)
        .collect(Collectors.summarizingInt(val -> val))
        .getSum();
    System.out.println(maxSum2);

  }

  private static int maxSum(int[] arr, int wSize, int length) {
    if (wSize == 0 || length == 0)
      return 0;
    if (wSize > length) {
      return maxSum(arr, wSize - 1, length);
    }
    return Math.max(arr[length - 1] + maxSum(arr, wSize - 1, length - 1),
        maxSum(arr, wSize, length - 1));
  }
}
