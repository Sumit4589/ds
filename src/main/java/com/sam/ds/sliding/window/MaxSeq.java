package com.sam.ds.sliding.window;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxSeq {

  private static int findMaxSum(int arr[], int wSize) {
    int sum = 0, maxSum = 0;
    int start = 0, end = wSize;
    sum = Arrays.stream(arr).limit(end).sum();
    maxSum = sum;
    for (int index = end; index < arr.length; index++) {
      sum = sum - arr[index - wSize] + arr[index];
      maxSum = Math.max(sum, maxSum);
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 6, 9, 0, 2, 1, 33};
    //System.out.println(findMaxSum(arr, 3));

    int arr2[] = {1,2,3,4,5};
    int arr3[] = {1,3,3,4,5};
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    Arrays.stream(arr2).boxed().forEach(stack1::push);
    Arrays.stream(arr3).boxed().forEach(stack2::push);

    while(!stack2.isEmpty()){
      if(stack1.peek() == stack2.peek()){
        stack1.pop();
        stack2.pop();
      }else{
        System.out.println("Not Found " + stack1.pop());
      }
    }

  }
}
