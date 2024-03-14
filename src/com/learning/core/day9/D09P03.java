package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        int n = scanner.nextInt();
	        
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        int key = scanner.nextInt();
	        
	        if (linearSearch(arr, key)) {
	            System.out.println("Element is Present");
	        } else {
	            System.out.println("Element is not Present");
	        }
	    }
	    
	    public static boolean linearSearch(int[] arr, int key) {
	        for (int num : arr) {
	            if (num == key) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
