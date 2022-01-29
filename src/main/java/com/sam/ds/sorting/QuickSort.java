package com.sam.ds.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = {4, 7, 9, 2, 8, 1, 6, 3, 5};
    System.out.println(Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int left, int right) {
    // TODO Auto-generated method stub
    if (right <= left) {
      return;
    }

    int pivot = sort(arr, left, right);
    quickSort(arr, left, pivot - 1);
    quickSort(arr, pivot + 1, right);
  }

  private static int sort(int[] arr, int left, int right) {
    // TODO Auto-generated method stub
    int pivot = (left + right) / 2;
    while (right > left) {
      while (arr[left] <= arr[pivot]) {
        left++;
      }
      while (arr[right] >= arr[pivot] && right >= 0) {
        right--;
      }
      if (right > left) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      }
    }
    int temp = arr[right];
    arr[right] = arr[pivot];
    arr[pivot] = temp;
    return right;
  }



}
