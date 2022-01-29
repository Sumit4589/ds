package com.sam.ds.dp;

public class UnboundedKnapsack {

  public static int knap(int v[], int wt[], int W, int n) {
    if (n == 0 || W == 0)
      return 0;
    if (wt[n - 1] > W)
      return knap(v, wt, W, n - 1);
    else
      //only change from kknap
      return Math.max(v[n - 1] + knap(v, wt, W - wt[n - 1], n), knap(v, wt, W, n - 1));
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 4;
    int v[] = {60,100,120,200};
    int wt[] = {10, 10, 10,10};
    int W = 30;
    System.out.println(knap(v,wt,W,n));
  }

}
