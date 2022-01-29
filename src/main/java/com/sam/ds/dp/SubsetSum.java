package com.sam.ds.dp;

public class SubsetSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = {2, 3, 7, 8, 10};
    int sum = 100;
    System.out.println(isSubSetSum(arr, sum, 5));
  }

  private static boolean isSubSetSum(int[] arr, int sum, int n) {
    // TODO Auto-generated method stub
    if (sum == 0)
      return true;
    else if(n == 0 && sum > 0) {
      return false;
    }

    if (arr[n - 1] > sum)
      return isSubSetSum(arr, sum, n - 1);

    return isSubSetSum(arr, sum - arr[n - 1], n - 1) || isSubSetSum(arr, sum, n - 1);

  }

}
