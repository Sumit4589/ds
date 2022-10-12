package com.sam.dp.state;

public class Fan {
  private FanState stopped;

  public FanState getStopped() {
    return stopped;
  }

  public void setStopped(FanState stopped) {
    this.stopped = stopped;
  }

  public FanState getMin() {
    return min;
  }

  public void setMin(FanState min) {
    this.min = min;
  }

  public FanState getMax() {
    return max;
  }

  public void setMax(FanState max) {
    this.max = max;
  }

  public FanState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(FanState currentState) {
    this.currentState = currentState;
  }

  private FanState min;
  private FanState max;

  private FanState currentState;

  public Fan(){
    stopped = new StoppedFanState(this);
    min = new MinFanState(this);
    max = new MaxFanState(this);
    currentState = stopped;
  }

  public void pullLeft(){
    currentState.decreaseSpeed();

  }
  public void pullRight(){
    currentState.increaseSpeed();
  }

}
