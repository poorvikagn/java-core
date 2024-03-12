package com.learning.core.Day3;


public class D03P12 {

    public static boolean canBeSplit(String input) {
        int n = input.length();

        if (n >= 10) {
            return true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String s1 = input.substring(0, i);
                    String s2 = input.substring(i, j);
                    String s3 = input.substring(j, k);
                    String s4 = input.substring(k);

                    if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4)
                            && !s2.equals(s3) && !s2.equals(s4) && !s3.equals(s4)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String input1 = "Helloworld";
        String input2 = "aaabb";

        System.out.println("Input 1: " + (canBeSplit(input1) ? "Yes" : "No"));
        System.out.println("Input 2: " + (canBeSplit(input2) ? "Yes" : "No"));
    }
}
