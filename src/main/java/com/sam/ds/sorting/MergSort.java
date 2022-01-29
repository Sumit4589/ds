package com.sam.ds.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergSort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = {4, 7, 9, 2, 8, 1, 6, 3, 5};
    System.out.println(Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  private static void mergeSort(int[] arr, int left, int right) {
    // divide
    if (left == right || left > right) {
      return;
    }
    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);

    int[] leftA = new int[mid - left + 1];
    int idx = 0;
    for (int i = left; i <= mid; i++) {
      leftA[idx] = arr[i];
      idx++;
    }

    int[] rightA = new int[right - mid];
    int idx2 = 0;
    for (int i = mid + 1; i <= right; i++) {
      rightA[idx2] = arr[i];
      idx2++;
    }

    int i = 0, j = 0, k = left;
    while (i <= leftA.length - 1 && j <= rightA.length) {
      if (leftA[i] < rightA[j]) {
        arr[k] = leftA[i];
        i++;
      } else {
        arr[k] = leftA[j];
        j++;
      }
      k++;
    }

    while (i < mid) {
      arr[k] = leftA[i];
      i++;
      k++;
    }

    while (j < right) {
      arr[k] = rightA[j];
      j++;
      k++;
    }

  }

}
