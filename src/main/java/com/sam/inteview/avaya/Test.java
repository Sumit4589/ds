package com.sam.inteview.avaya;

public class Test {
  public static void main(String[] args) {
    Integer a = 1;
    Integer  b = 2;
    System.out.println(a + " " + b);
    swap(a, b);
    System.out.println(a + " " + b);
  }

  private static void swap(Integer a, Integer b) {
    Integer x = a;
    a = b;
    b =x;
    System.out.println(a + " " + b);
  }
}
