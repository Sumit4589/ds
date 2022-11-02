package com.sam.concurrency;

public class Default implements DefaultInterface1, DefaultInterface2 {
  @Override public void fun1() {
    //DefaultInterface1.super.fun1();
    System.out.println("In Default");
  }

  public static void main(String[] args) {
    DefaultInterface1 f1 = new Default();
    DefaultInterface2 f2 = new Default();
    //f1.fun1();
    f2.fun1();
  }
}
