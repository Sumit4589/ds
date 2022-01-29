package com.sam.ds.dp;

public class Knapsack {

  public static int knap(int v[], int wt[], int W, int n) {
    if (n == 0 || W == 0)
      return 0;
    if (wt[n - 1] > W)
      return knap(v, wt, W, n - 1);
    else
      return Math.max(v[n - 1] + knap(v, wt, W - wt[n - 1], n - 1), knap(v, wt, W, n - 1));
  }

  public static int knapDp(int v[], int wt[], int W, int n) {
    int mat[][] = new int[n + 1][W + 1];
    // initialize
    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j < W + 1; j++) {
        if (i == 0 || j == 0) {
          mat[i][j] = 0;
        } else if (wt[i - 1] > j) {
          mat[i][j] = mat[i - 1][j];
        } else {
          mat[i][j] = Math.max(v[i - 1] + mat[i - 1][j - wt[i - 1]], mat[i - 1][j]);
        }

      }

    }

    return mat[n][W];
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 4;
    int v[] = {60, 100, 120, 200};
    int wt[] = {10, 10, 10, 10};
    int W = 10;
    System.out.println(knap(v, wt, W, n));
    System.out.println(knapDp(v, wt, W, n));
  }

}
