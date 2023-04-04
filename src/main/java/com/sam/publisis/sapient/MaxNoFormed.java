package com.sam.publisis.sapient;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxNoFormed {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("9", "98", "3", "99");
    Comparator<String> comparator = (a,b) -> b.concat(a).compareTo(a.concat(b));
    Collections.sort(list, comparator);
    list.forEach(System.out::print);
  }
}
