package com.learning.core.day8;
import java.util.Scanner;

class CircularQueue {
	    private static final int size = 4;
	    private int[] array = new int[size];
	    private int front = -1, rear = -1;

	    public boolean isFull() {
	        return (front == 0 && rear == size - 1) || (front == rear + 1);
	    }

	    public boolean isEmpty() {
	        return front == -1;
	    }

	    public void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue.");
	            return;
	        }
	        if (front == -1) {
	        	System.out.print("Elements in circular queue: ");
	            front = 0;
	        }
	        rear = (rear + 1) % size;
	        array[rear] = value;
	    }

	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return;
	        }
	        
	        if (front == rear) {
	        	 front = rear = -1;
	        } else {
	            front = (front + 1) % size;
	        }
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        
	        int i = front;
	        do {
	            System.out.print(array[i] + " ");
	            i = (i + 1) % size;
	        } while (i != (rear + 1) % size);
	        System.out.println();
	    }
	}

public class D08P03 {
	    public static void main(String[] args) {
	        CircularQueue circularQueue = new CircularQueue();
	        Scanner scanner = new Scanner(System.in);

	        circularQueue.enqueue(14);
	        circularQueue.enqueue(13);
	        circularQueue.enqueue(22);
	        circularQueue.enqueue(-8);
	        
	        circularQueue.display();

	        circularQueue.dequeue();
	        
	        System.out.print("After removing first element: ");
	        circularQueue.display();

	        scanner.close();
	    }
	}