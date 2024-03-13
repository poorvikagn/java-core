package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P05 {

	public static Queue<Integer>[] splitQueue(Queue<Integer> queue) {
		        Queue<Integer> oddQueue = new LinkedList<>();
		        Queue<Integer> evenQueue = new LinkedList<>();
		        
		        while (!queue.isEmpty()) {
		            int num = queue.poll(); 

		            if (num % 2 == 0) {
		                evenQueue.add(num);
		            } else {
		                oddQueue.add(num);
		            }
		        }

		        Queue<Integer>[] result = new Queue[2];
		        result[0] = oddQueue;
		        result[1] = evenQueue;

		        return result;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        String input = scanner.nextLine().trim();
		        
		        String[] elements = input.split("\\s+");
		        Queue<Integer> queue = new LinkedList<>();

		        for (String element : elements) {
		            queue.add(Integer.parseInt(element));
		        }

		        Queue<Integer>[] result = splitQueue(queue);

		        System.out.print("Odd Queue: ");
		        while (!result[0].isEmpty()) {
		            System.out.print(result[0].poll() + " ");
		        }
		        System.out.println();
 
		        System.out.print("Even Queue: ");
		        while (!result[1].isEmpty()) {
		            System.out.print(result[1].poll() + " ");
		        }
		        System.out.println();

		      
		        scanner.close();
		    }
		}

