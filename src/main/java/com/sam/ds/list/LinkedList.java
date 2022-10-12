package com.sam.ds.list;

public class LinkedList<T> {
  private ListNode<T> header;

  public void add(T data) {
    ListNode<T> newNode = new ListNode<>(data);
    if (header == null) {
      header = newNode;
    } else {
      if(findCycle()){
        System.out.println("Cycle found before " + data);
        return;
      }
      ListNode temp = header;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
      //TODO : add cycle on 5
     /* if((Integer)data == 6){
        newNode.next=header;
      }*/
    }
  }

  public void print() {
    ListNode temp = header;
    while (temp != null && temp.next != header) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public void reverse(){
    ListNode temp = header.next;
    header.next = null;
    while(temp != null){
      ListNode tempNext = temp.next;
      temp.next = header;
      header = temp;
      temp = tempNext;
    }
  }

  public boolean findCycle() {
    if(header == null || header.next == null){
      return false;
    }
    ListNode p1 = header;
    ListNode p2 = header.next.next;
    while (p2 != null){
      if(p1.data == p2.data){
        return  true;
      } else if(p2.next == null){
        return false;
      }
      p1 = p1.next;
      p2 = p2.next.next;
    }
    return false;
  }
}
