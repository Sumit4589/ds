package com.sam.dp.state;

public class FanTest {
  public static void main(String[] args) {
    Fan fan = new Fan();
    fan.pullRight();
    fan.pullRight();
    fan.pullRight();
    fan.pullLeft();
    fan.pullLeft();
    fan.pullLeft();
  }
}
