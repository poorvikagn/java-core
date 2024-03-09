package com.learning.core.Day3;
	import java.util.*;
	public class D03P04 {
		 
	    static int getFirstRepeatingElementArray(int[] array) {
	        
	        Set<Integer> set = new HashSet<>();
	        int minIndex = Integer.MAX_VALUE;
	        for (int i = array.length - 1; i >= 0; i--) {
	            if (set.contains(array[i])) {
	                
	                minIndex = i;
	            } else {
	               
	                set.add(array[i]);
	            }
	        }

	        
	        return (minIndex != Integer.MAX_VALUE) ? minIndex : -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 5, 3, 4, 3, 5, 6};
	        int index = getFirstRepeatingElementArray(arr);

	        if (index == -1) {
	            System.out.println("No repeating element found!");
	        } else {
	            System.out.println("First repeating element is " + arr[index]);
	        }
	    }
	}

