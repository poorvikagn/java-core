package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;

class QueueLinkedList {
    private Queue<Integer> queue = new LinkedList<>();

    public void enqueue(int value) {
        queue.add(value);
    }

    public void dequeue(int count) {
        if (count > queue.size()) {
            System.out.println("Cannot remove more elements than available in the queue.");
            return;
        }
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
    }

    public void display() {
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class D08P02 {
    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        System.out.print("Elements in queue: ");
        
        ql .enqueue(89);
        ql .enqueue(99);
        ql .enqueue(109);
        ql .enqueue(209);
        ql .enqueue(309);

        ql .display();

        ql .dequeue(2);
        
        System.out.print("After removing first element: ");
        ql .display();
    }
}