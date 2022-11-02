package com.sam.concurrency;

public interface DefaultInterface1 {
  public default void fun1(){
    System.out.println("In DefaultInterface1");
  }
}
