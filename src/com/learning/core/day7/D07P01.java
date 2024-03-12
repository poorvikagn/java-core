package com.learning.core.Day7;

public class D07P01 {
	 private static final int MAX_SIZE = 4;
	    private String[] stackArray;
	    private int top;

	    public D07P01() {
	        stackArray = new String[MAX_SIZE];
	        top = -1;
	    }

	    public void push(String element) {
	        if (top == MAX_SIZE - 1) {
	            System.out.println("Stack overflow! Cannot push element: " + element);
	            return;
	        }
	        stackArray[++top] = element;
	    }

	    public String pop() {
	        if (top == -1) {
	            System.out.println("Stack underflow! Cannot pop from an empty stack.");
	            return null;
	        }
	        return stackArray[top--];
	    }

	    public static void main(String[] args) {
	    	D07P01 stack = new D07P01();

	        stack.push("Hello");
	        stack.push("world");
	        stack.push("java");
	        stack.push("Programming");

	        System.out.println("After Pushing 4 Elements: " + stackArrayToString(stack.stackArray, stack.top));

	        stack.pop();

	        System.out.println("After a Pop: " + stackArrayToString(stack.stackArray, stack.top));
	    }

	    private static String stackArrayToString(String[] array, int top) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i <= top; i++) {
	            result.append(array[i]).append(" ");
	        }
	        return result.toString();
	    }
	}