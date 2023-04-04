package com.sam.interview.thoughtworks;

import java.util.LinkedList;
import java.util.List;

public class EqualSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = {10, 20, 30, 40, 100};

    int arr2[] = {10, 20, 30, 40, 100, 200, 200};
    int arr3[] = {1, 5, 5, 11, 15, 15, 30};
    int arr4[] = {-1, -1, 0, 1, 5, 7, 10, 21};

    List<Integer> leftarr = new LinkedList<>();
    List<Integer> rightarr = new LinkedList<>();


    //arr = arr3;

    int j = arr.length - 1;

    int leftSum = 0, rightSum = 0;

    leftSum = arr[j];
    leftarr.add(arr[j]);
    rightSum = arr[--j];
    rightarr.add(arr[j]);

    while (j >= 0) {
      --j;
      if (rightSum == leftSum && j < 0) {
        break;
      }
      if (j < 0) {
        break;
      }
      if (rightSum > leftSum) {
        leftSum = leftSum + arr[j];
        leftarr.add(arr[j]);
      } else {
        rightSum = rightSum + arr[j];
        rightarr.add(arr[j]);
      }
    }

    System.out.println(leftSum + "  " + leftarr);
    System.out.println(rightSum + "  " + rightarr);
  }

}
