package com.sam.inteview.common;

public class Exchangevar {
  public static void main(String[] args) {
    int a = 20, b= 30;
    System.out.println("a = "+ a + " b = "+ b);
    a = a + b;
    b = a - b;
    a = a- b;
    System.out.println("a = "+ a + " b = "+ b);
    //////////////
    String str = "abcbaj";
    StringBuilder strB = new StringBuilder(str);
    String str2 = strB.reverse().toString();
    if(str.equals(str2)){
      System.out.println(true);
    }
  }
}
