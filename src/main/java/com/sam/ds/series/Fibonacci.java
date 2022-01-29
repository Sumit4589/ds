package com.sam.ds.series;
//Fibonacci Series using Recursion
public class Fibonacci
{
    static int fib(int n, int[] arr)
    {
    if (n <= 1){
    arr[n] = n;
      return n;
    }
    int sum = fib(n-1,arr) + fib(n-2,arr);
      arr[n-1] = sum;
      return sum;
    }
    
    public static void main (String args[])
    {
    int n = 9;
      int arr[] = new int[9];
    System.out.println(fib(n, arr));
      for(int i=0; i<n ; i++){
        System.out.println(arr[i]);
      }
    }
}
/* This code is contributed by Rajat Mishra */
