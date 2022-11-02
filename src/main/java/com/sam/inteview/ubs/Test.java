package com.sam.inteview.ubs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(4);
    list.add(3);
    list.add(2);
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    List<String> strList = Arrays.asList("a", "b", "a");
    Map<String, Long> map = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    String s1 = new String("hello");
    String s2 = "hello";
    String s3 = s1.intern();
    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
  }
}
