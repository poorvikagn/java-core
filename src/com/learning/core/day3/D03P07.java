package com.learning.core.Day3;
import java.util.Scanner;
public class D03P07 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	       
	        System.out.println("Output:");
	        printAllSubsequences(inputString);
	    }

	    private static void printAllSubsequences(String inputString) {
	        int length = inputString.length();

	        int totalSubsets = (int) Math.pow(2, length);

	        for (int i = 1; i < totalSubsets; i++) {
	            StringBuilder subsequence = new StringBuilder();

	            for (int j = 0; j < length; j++) {
	                if ((i & (1 << j)) > 0) {
	                    subsequence.append(inputString.charAt(j));
	                }
	            }

	            System.out.print(subsequence + ",");
	        }
	        System.out.println();
	    }
}