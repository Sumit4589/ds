package com.sam.ds.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Result {

  /*
   * Complete the 'steadyGene' function below.
   *
   * The function is expected to return an INTEGER. The function accepts STRING gene as parameter.
   */

  public static int steadyGene(String gene) {
    // Write your code here
    int count = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < gene.length(); i++) {
      if ("ACTG".contains(Character.toString(gene.charAt(i)))) {
        Integer val = map.get(gene.charAt(i)) == null ? 0 : map.get(gene.charAt(i));
        val++;
        map.put(gene.charAt(i), val);
      }
    }
    Long count1 = map.values().stream().map(le -> le % gene.length())
        .collect(Collectors.summarizingInt(m -> m)).getSum();

    count = count1.intValue();
    return count;

  }

}


public class BearString {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String gene = bufferedReader.readLine();

    int result = Result.steadyGene(gene);
    System.out.println(result);
    bufferedReader.close();
  }
}
