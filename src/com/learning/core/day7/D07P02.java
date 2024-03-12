package com.learning.core.Day7;
public class D07P02 {

    private Node top;

    private static class Node {
        double data;
        Node next;

        Node(double data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(double value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        double poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public void printStack() {
        Node currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    	D07P02 stack = new D07P02();

        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        System.out.print("The elements of the stack are: ");
        stack.printStack();

        stack.pop();
        stack.pop();

        System.out.print("After popping twice: ");
        stack.printStack();
    }
}