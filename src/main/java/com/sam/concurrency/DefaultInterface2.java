package com.sam.concurrency;

public interface DefaultInterface2 {
  public default void fun1(){
    System.out.println("In DefaultInterface2");
  }
}
