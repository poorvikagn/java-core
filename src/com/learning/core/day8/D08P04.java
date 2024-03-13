package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P04 {
public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        String input = scanner.nextLine().trim();

		      
		        if (input.equals("[]")) {
		            System.out.println("Empty");
		            scanner.close();
		            return;
		        }

		        
		        String[] elements = input.split("\\s+");

		       
		        Queue<String> queue = new LinkedList<>();

		      
		        for (String element : elements) {
		            queue.add(element);
		        }

		       
		        if (queue.isEmpty()) {
		            System.out.println("Empty");
		        } else {
		            System.out.println("Not Empty");
		        }

		        scanner.close();
		    }
	}
