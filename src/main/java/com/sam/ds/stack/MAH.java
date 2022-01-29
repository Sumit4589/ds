package com.sam.ds.stack;

public class MAH {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int x[] = {6, 2, 5, 4, 5, 1, 6};

    int maxAr = 0;
    for (int i = 0; i < x.length; i++) {
      int count = 1;
      for (int j = i - 1; j >= 0; j--) {
        if (x[j] > x[i]) {
          count++;
        } else {
          break;
        }
      }
      for (int j = i + 1; j < x.length; j++) {
        if (x[j] > x[i]) {
          count++;
        } else {
          break;
        }
      }
      maxAr = Math.max(maxAr, count * x[i]);
    }
    System.out.println(maxAr);

  }

}
