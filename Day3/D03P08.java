package com.learning.core.Day3;
import java.util.Scanner;
public class D03P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int minDeletions = findMinDeletions(inputString);
        System.out.println("Output:");
        System.out.println(minDeletions);
    }

    private static int findMinDeletions(String inputString) {
       
        int longestPalindromeLength = longestPalindromicSubsequence(inputString);
        return inputString.length() - longestPalindromeLength;
    }

    private static int longestPalindromicSubsequence(String inputString) {
        int n = inputString.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (inputString.charAt(i) == inputString.charAt(j) && cl == 2) {
                    dp[i][j] = 2;
                } else if (inputString.charAt(i) == inputString.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }
}