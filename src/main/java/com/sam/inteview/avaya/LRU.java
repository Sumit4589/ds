package com.sam.inteview.avaya;

import java.util.*;

public class LRU {
  private Map<Integer, String> cache;
  private Queue<Integer> cacheKeyQueue;
  private int capacity;
  public LRU(int capacity){
    this.capacity = capacity;
    cache = new LinkedHashMap();
    cacheKeyQueue = new LinkedList();
  }

  public void add(int key, String value){
      if(cache.size() >= capacity){
        int keyToRemove = cacheKeyQueue.poll();
        cache.remove(keyToRemove);
      }
  }

}
