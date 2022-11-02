package com.sam.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
  public static void main(String[] args) {
    ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    map.put("ONE", 1);
    map.put("TWO", 2);
    Iterator itr =  map.keySet().iterator();

    while(itr.hasNext()){
      Object key = itr.next();
      System.out.println(key +" "+map.get(key));
      map.remove("ONE");
    }
  }
}
