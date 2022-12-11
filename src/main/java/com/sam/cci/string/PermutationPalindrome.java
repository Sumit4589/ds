package com.sam.cci.string;

public class PermutationPalindrome {
    public static void main(String[] args) {
        String str = "acbcabfgh";
        int arr[] = constructArray(str);
        boolean found = palindromend(arr);
        System.out.println("palindrome found " + found);
    }

    private static boolean palindromend(int[] arr) {
        int oddCount = 0;
        for (int val : arr) {
            if (val % 2 == 1) {
                oddCount++;
            }

        }
        if (oddCount > 1) {
            return false;
        }
        return true;
    }

    private static int[] constructArray(String str) {
        int arr[] = new int[255];
        for (char ch : str.toCharArray()) {
            int val = Character.valueOf(ch);
            arr[val] = arr[val] + 1;
        }
        return arr;
    }
}
