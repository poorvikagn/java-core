package com.learning.core.Day7;
import java.util.Stack;
public class D07P03 {
	    public static String reverseString(String input) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : input.toCharArray()) {
	            stack.push(ch);
	        }

	        StringBuilder reversedString = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }

	        return reversedString.toString();
	    }

	    public static void main(String[] args) {
	        String inputString = "JavaQuiz";
	        String reversedString = reverseString(inputString);

	        System.out.println(inputString);
	        System.out.println(reversedString);
	    }
	}

