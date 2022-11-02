package com.sam.core;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
  public static void main(String[] args) {
    int[] intArr = {1, 2, 3, 4, 5, 6};
    List<Integer> list = new ArrayList<>();
    list.add(1);list.add(2);list.add(3);list.add(4);
    System.out.println(list);
    list.removeIf(ele -> ele % 2 == 0);
    System.out.println(list);

    //////////

    Map<String, String> map = new HashMap<>();
    map.put("Name", "Aman");
    map.put("Address", "Kolkata");

    // Print the map
    System.out.println("Map: " + map);

    // remap the values using compute() method
    map.compute("Name", (key, val)
        -> key.concat(" Singh"));
    map.compute("Address", (key, val)
        -> key.concat(" West-Bengal"));
    System.out.println("New Map: " + map);

    // print new mapping
    Map<String, String> map2 = new HashMap<>();
    map2.put("Name", "Aman");
    map2.put("Address", "Kolkata");
    System.out.println("Map2: " + map2);
    new ConcurrentHashMap<>();
    map2.compute("Name", (key, val)
        -> val.concat(" Singh"));
    map2.compute("Address", (key, val)
        -> val.concat(" West-Bengal"));

    // print new mapping
    System.out.println("New Map2: " + map2);
  }

}
