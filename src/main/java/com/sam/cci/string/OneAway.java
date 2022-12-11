package com.sam.cci.string;

public class OneAway {
    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "pales";
        boolean isOneAway = isOneAway(s1, s2);
        System.out.println(isOneAway);
    }

    private static boolean isOneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return isOneEditReplace(s1, s2);
        } else if (s1.length() - s2.length() == 1) {
            return isOneEditInsert(s1, s2);
        } else if (s2.length() - s1.length() == 1) {
            isOneEditInsert(s2, s1);
        }
        return false;
    }

    private static boolean isOneEditReplace(String s1, String s2) {
        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }
        if (diffCount == 1) {
            return true;
        }
        return false;
    }

    private static boolean isOneEditInsert(String s1, String s2) {
        int idx1 = 0, idx2 = 0;
        int count = 0;
        while (idx1 < s1.length()) {
            if (s1.charAt(idx1) != s2.charAt(idx2)) {
                count++;
                idx1++;
            } else {
                idx1++;
                idx2++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}
