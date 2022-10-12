package com.sam.dp.state;

public class MaxFanState implements FanState{
  private Fan fan;
  private int speed = 5;
  public MaxFanState(Fan fan) {
      this.fan = fan;
  }

  @Override public void increaseSpeed() {
    System.out.println("Fan is already on top speed");
  }

  @Override public void decreaseSpeed() {
    System.out.println("decreasing from " + speed);
    fan.setCurrentState(fan.getMin());
    System.out.println("decreased to " + fan.getCurrentState().getSpeed());
  }

  @Override public int getSpeed() {
    return speed;
  }
}
