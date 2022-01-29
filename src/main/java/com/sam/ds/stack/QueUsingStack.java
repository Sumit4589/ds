package com.sam.ds.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QueUsingStack {

  public static Queue<Integer> getQ(int... a) {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Queue<Integer> qu = new LinkedList<Integer>();

    for (int i : a) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
      stack1.push(i);

      while (!stack2.isEmpty()) {
        stack1.push(stack2.pop());
      }
    }

    stack1.forEach(System.out::println);
    System.out.println(stack1.pop());
    System.out.println(stack1.pop());
    return qu;

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      getQ(1,2,3,4,5);
  }

}
