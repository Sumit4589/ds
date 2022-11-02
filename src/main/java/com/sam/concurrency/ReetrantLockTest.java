package com.sam.concurrency;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class ReetrantLockTest {
  public static void main(String[] args) throws InterruptedException {
    ReentrantLock lock = new ReentrantLock();
    Task task = new Task(lock);
    Runnable runnable = () -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      task.work();
    };
    Thread t1 = new Thread(runnable);
    t1.start();
    task.work();

  }

}


class Task {
  ReentrantLock lock;

  public Task(ReentrantLock lock) {
    this.lock = lock;
  }

  public void work()  {
    try {
      System.out.println(Thread.currentThread() + "trying to acquire lock");
      lock.lock();
      System.out.println(Thread.currentThread().getName() + " acquired lock");
      Thread.sleep(6000);
      if(Thread.currentThread().getName().equals("main")){
        //throw new RuntimeException("interrupt intetionally");
      }
      lock.unlock();
      System.out.println(Thread.currentThread() + "released lock");
    } catch (InterruptedException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
