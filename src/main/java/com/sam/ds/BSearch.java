package com.sam.ds;

public class BSearch {


  public boolean search(int arr[], int ele) {
    return find(arr, ele, 0, arr.length - 1);
  }

  private boolean find(int[] arr, int ele, int start, int end) {
    if (end < start) {
      return false;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == ele)
      return true;
    else if (arr[mid] > ele) {
      return find(arr, ele, start, mid - 1);
    } else {
      return find(arr, ele, mid + 1, end);
    }
  }

  public static void main(String[] args) {
    BSearch search = new BSearch();
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println(search.search(arr, 6));
  }

}
