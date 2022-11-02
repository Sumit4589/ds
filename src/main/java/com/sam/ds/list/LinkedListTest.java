package com.sam.ds.list;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
/*    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);   list.add(9);*/


    list.print();
    //System.out.println(list.findCycle());
    System.out.println();
    //list.reverse();
    list.delete(5);
    list.print();
  }

  public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    Long val = ar.stream().reduce(0L, (a, b) -> a + b);
    return val;
  }

}


