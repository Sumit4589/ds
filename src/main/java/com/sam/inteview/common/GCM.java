package com.sam.inteview.common;

public class GCM {
  public static void main(String[] args) {
    int a = 11, b = 13;
    int start = Math.max(a, b);
    boolean gcmFound =false;
    for (int i = start; i < Integer.MAX_VALUE; i++) {
      if ((i % a) == 0 && (i % b == 0)) {
        System.out.println("GCM : "+ i);
        gcmFound = true;
        break;
      }
    }
    if(!gcmFound)
      System.out.println("No GCM");
  }
}
