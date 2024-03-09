package com.learning.core.Day2;
import java.util.Scanner;

public class D02P08 {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of L: ");
	        int L = sc.nextInt();
	        System.out.print("Enter the value of R: ");
	        int R = sc.nextInt();

	        System.out.print("Enter the total number of elements (n): ");
	        int n = sc.nextInt();

	        long sum = 0;
	        for (int i = L; i <= R; i++) {
	            sum += i;
	        }

	        System.out.println("Sum of elements in the range [" + L + ", " + R + "] is: " + sum);
	        sc.close();
	    }
	}
