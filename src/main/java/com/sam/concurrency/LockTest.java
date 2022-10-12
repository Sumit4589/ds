package com.sam.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;



public class LockTest {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread());
    Model model = new Model();
    Runnable r1 = () -> model.increament();
    Runnable r2 = () -> model.increament();
    Runnable r3 = () -> model.increament();
    ExecutorService service = Executors.newFixedThreadPool(3);
    service.submit(r1);service.submit(r2);service.submit(r3);
    sleepSomeTime(5000);
    service.shutdown();
  }

  public static void sleepSomeTime(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}


class Model {
  private int count = 0;

  private ReentrantLock lock = new ReentrantLock(true);

  public void increament() {
    lock.lock();
    count++;
    LockTest.sleepSomeTime(2000);
    System.out.println(count + " " + lock.isLocked() + " " + Thread.currentThread());
    lock.unlock();
  }

}
