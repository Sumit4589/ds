package com.sam.dp.state;

public class MinFanState implements FanState{
  private Fan fan;
  private int speed = 1;
  public MinFanState(Fan fan) {
    this.fan = fan;
  }

  @Override public void increaseSpeed() {
    System.out.println("increasing from " + speed);
    fan.setCurrentState(fan.getMax());
    System.out.println("increased to " + fan.getCurrentState().getSpeed());
  }

  @Override public void decreaseSpeed() {
    System.out.println("decreasing from " + speed);
    fan.setCurrentState(fan.getStopped());
    System.out.println("decreased to " + fan.getCurrentState().getSpeed());
  }

  @Override public int getSpeed() {
    return speed;
  }
}
