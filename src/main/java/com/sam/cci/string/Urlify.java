package com.sam.cci.string;

public class Urlify {
    public static void main(String[] args) {
        String str = " Hi There  ";
        int trueLength = 6;
        System.out.println(urlify(str, trueLength)); //trim ??
    }

    private static String urlify(String str, int trueLength) {
        int idx = 0, trueIdx = 0;
        StringBuilder builder = new StringBuilder();
        while (trueIdx <= trueLength) {
            if (str.charAt(idx) == ' ') {
                builder.append("%20");
            } else {
                builder.append(str.charAt(idx));
                trueIdx++;
            }
            idx++;
        }
        return builder.toString();
    }
}
