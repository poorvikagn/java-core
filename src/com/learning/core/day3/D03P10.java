package com.learning.core.Day3;

public class D03P10 {
	public static int longestPrefixSuffix(String str) {
	       int n = str.length();
	       int lps[] = new int[n]; // Array to store longest prefix suffix values
	       int len = 0; // Length of the previous longest prefix suffix

	       lps[0] = 0; // lps[0] is always 0

	       // Loop to calculate lps[i] for i = 1 to n-1
	       int i = 1;
	       while (i < n) {
	           if (str.charAt(i) == str.charAt(len)) {
	               len++;
	               lps[i] = len;
	               i++;
	           } else {
	               if (len != 0) {
	                   len = lps[len - 1];
	               } else {
	                   lps[i] = 0;
	                   i++;
	               }
	           }
	       }
	       return lps[n - 1];
	   }

	   public static void main(String[] args) {
	       String s1 = "aabcdaabc";
	       String s2 = "abcab";
	       System.out.println("Length of longest prefix suffix for " + s1 + ": " + longestPrefixSuffix(s1));
	       System.out.println("Length of longest prefix suffix for " + s2 + ": " + longestPrefixSuffix(s2));
	   }
	}

