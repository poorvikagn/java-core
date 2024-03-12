package com.learning.core.Day7;

import java.util.Stack;
public class D07P06 {
    static class StackWithMin extends Stack<Integer> {
        private Stack<Integer> minStack;

        public StackWithMin() {
            minStack = new Stack<>();
        }

        @Override
        public Integer push(Integer item) {
            if (item <= getMin()) {
                minStack.push(item);
            }
            return super.push(item);
        }

        @Override
        public synchronized Integer pop() {
            int popped = super.pop();
            if (popped == getMin()) {
                minStack.pop();
            }
            return popped;
        }

        public int getMin() {
            if (minStack.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return minStack.peek();
            }
        }
    }

    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(16);
        stack.push(15);
        stack.push(29);
        stack.push(19);
        stack.push(18);

        System.out.println(stack.getMin()); // Output: Minimum element in the stack: 15
    }
}