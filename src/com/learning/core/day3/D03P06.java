package com.learning.core.Day3;
import java.util.Scanner;
public class D03P06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine().toLowerCase(); 

       
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

    
        String lastNVowels = countLastNVowels(inputString, n);

       
        System.out.println(lastNVowels);
    }

    private static String countLastNVowels(String inputString, int n) {
        int vowelCount = 0;
        StringBuilder lastNVowels = new StringBuilder();

       
        for (int i = inputString.length() - 1; i >= 0 && vowelCount < n; i--) {
            char currentChar = inputString.charAt(i);
            if (isVowel(currentChar)) {
                lastNVowels.insert(0, currentChar); 
                vowelCount++;
            }
        }

        
        if (vowelCount < n) {
            return "Mismatch in Vowel Count";
        }

        return lastNVowels.toString();
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}