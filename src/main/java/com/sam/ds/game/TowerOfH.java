package com.sam.ds.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TowerOfH {


  public static void TowerOfH(int n, char from, char to, char aux) {
    if (n == 1) {
      System.out.println("Move disk " + n + " from pole " + from + " to " + to);
      return;
    }
    TowerOfH(n-1,from,aux,to);
    System.out.println("Move disk " + n + " from pole " + from + " to " + to);
    TowerOfH(n-1,aux,to,from);
  }



  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TowerOfH(3, 'A', 'C', 'B');

  }

}
