package com.learning.core.Day3;

public class D03P13 {

    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = replaceSpaces(input);
        System.out.println(output);
    }

    private static String replaceSpaces(String input) {
        return input.replaceAll(" ", "%20");
    }
}