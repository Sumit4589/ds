package com.sam.cci.string;

import java.util.Hashtable;

public class UniqueCharTest {
    public static void main(String[] args) {
        String str = "summit";
        //No Data Strcture
        char[] chArr = str.toCharArray();
        for (char ch : chArr) {
            int idx = str.indexOf(ch);
            for (int i = idx + 1; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    System.out.println("Not Unique");
                    break;
                }
            }
        }
        Hashtable<Character, Character> tbl = new Hashtable<>();
        for (char ch : str.toCharArray()) {
            tbl.put(ch, ch);
        }
    }
}
