package com.sam.dp.state;

public class StoppedFanState implements FanState {

  private Fan fan;
  private int speed = 0;

  public StoppedFanState(Fan fan) {
    this.fan = fan;
  }

  @Override public void increaseSpeed() {
    System.out.println("increasing from " + speed);
    fan.setCurrentState(fan.getMin());
    System.out.println("increased to " + fan.getCurrentState().getSpeed());
  }

  @Override public void decreaseSpeed() {
    System.out.println("Fan is already stopped");
  }

  @Override public int getSpeed() {
    return speed;
  }
}
