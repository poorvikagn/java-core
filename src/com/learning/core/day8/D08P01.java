package com.learning.core.day8;
import java.util.Scanner;
class Queue {
    private static final int size = 5;
    private int[] array = new int[size];
    private int front = -1, rear = -1;

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full " + value);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            array[rear] = value;
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
           
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
public class D08P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        System.out.print("Elements in queue: ");
     
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();

        System.out.print("After removing First element:");
        queue.display();

        scanner.close();
    }
}

	

