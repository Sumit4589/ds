package com.sam.ds.dp;

public class Fib {


  public static int fib(int n) {
    if (n == 1 || n == 2)
      return n;
    else
      return fib(n - 1) + fib(n - 2);
  }

  public static int fibDp(int n) {
    int arr[] = new int[n + 1];
    arr[1] = arr[2] = 1;
    for (int i = 3; i <= n; i++)
      arr[i] = arr[i - 1] + arr[i - 2];
    return arr[n];

  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(fib(5));
    System.out.println(fibDp(5));

  }

}
// 1 1 2 3 5 8
