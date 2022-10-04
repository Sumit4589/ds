package com.sam.ds.list;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);   list.add(9);


    list.print();
    System.out.println(list.findCycle());
  }
}
