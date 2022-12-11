package com.sam.cci.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    public static void main(String[] args) {
        String s1 = "sumiitl";
        String s2 = "muistir";
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s2Arr);
        System.out.println(Arrays.equals(s1Arr, s2Arr));

        //
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1Arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : s2Arr) {
            if (map.get(ch) == null) {
                System.out.println(false);
                break;
            } else if (map.get(ch) == 1) {
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        if(map.isEmpty()){
            System.out.println(true);
        }
    }
}
