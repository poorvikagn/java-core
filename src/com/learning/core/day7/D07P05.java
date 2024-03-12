package com.learning.core.Day7;

import java.util.Stack;

public class D07P05 {
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    public static void printStack(Stack<Integer> stack) {
        for (int i : stack) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);

        printStack(inputStack);

        reverseStack(inputStack);

        printStack(inputStack);
    }
}