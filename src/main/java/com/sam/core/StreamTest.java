package com.sam.core;

import jdk.dynalink.beans.StaticClass;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
  public static void main(String[] args) {
    Stream<Character> str = IntStream.of(64, 65, 66, 67).mapToObj(i -> (char) i);
    //str.forEach(System.out::println);

    int[] intArr = {1, 2, 3, 4, 5, 6};
    IntStream iStream = Arrays.stream(intArr, 0, 3);
    iStream.forEach(System.out::println);

    List<String> ss = List.of("ovi", "sumit", "nikita", "puja", "sandi");
    //ss.sorted(Comparator.comparing(String::length).thenComparing(String::compareTo).reversed()).forEach(s -> System.out.print(s+ " "));

    String s = null;
    Optional<String> op = Optional.ofNullable(s);
    //System.out.println(op.flatMap(StreamTest::length).isPresent());
    Map<Integer, List<String>> combined = ss.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(name -> name.substring(1), Collectors.toList())));

    Map<Integer, List<String>> combined2 = ss.stream().collect(Collectors.groupingBy(String::length, Collectors.filtering(name -> name.length() > 3, Collectors.toList())));
    System.out.println(combined);
    System.out.println("====");
    System.out.println(combined2);
  }

  private static Optional<Integer> length(String s) {
    return Optional.ofNullable(s.length());
  }
}
