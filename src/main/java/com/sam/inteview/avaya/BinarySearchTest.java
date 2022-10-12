package com.sam.inteview.avaya;

import java.util.Arrays;

public class BinarySearchTest {
  public static void main(String[] args) {
    // niput arr
    int[] arr = {3, 1, 4, 8, 7, 5};
    Arrays.sort(arr);
    int element = 11;
    System.out.println(find(arr, element));

  }

  private static int find(int[] arr, int element) {
    return binSearch(arr, element, 0, arr.length);
  }

  private static int binSearch(int[] arr, int element, int start, int end) {
    if (start >= end) {
      return -1;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == element) {
      return mid;
    } else if (arr[mid] > element) {
      return binSearch(arr, element, start, mid);
    } else {
      return binSearch(arr, element, mid + 1, end);
    }
  }
}
