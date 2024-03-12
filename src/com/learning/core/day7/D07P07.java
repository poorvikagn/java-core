package com.learning.core.Day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
	
	 public static boolean isTopElementEven(Stack<Integer> stack) {
	        if (stack.isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }

	        int topElement = stack.peek();
	        return topElement % 2 == 0;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String userInput = scanner.nextLine();

	        Stack<Integer> inputStack = new Stack<>();
	        for (String number : userInput.split("\\s+")) {
	            if (!number.isEmpty()) {
	                inputStack.push(Integer.parseInt(number));
	            }
	        }

	        try {
	            boolean isEven = isTopElementEven(inputStack);
	            System.out.println("Is the Top Element Even? " + isEven);
	        } catch (IllegalStateException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }

}