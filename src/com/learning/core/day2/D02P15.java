package com.learning.core.Day2;

import java.util.Scanner;
public class D02P15 {
	public static void main(String[] args)
	   {
	      int countP=0, countN=0, countZ=0, i,n;
	      int[] arr = new int[10];
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("Enter the number : ");
		  n = scan.nextInt();
		   
		  System.out.println("Enter "+n+" Numbers:");
	      for(i=0; i<n; i++)
	         arr[i] = scan.nextInt();
	      
	      for(i=0; i<n; i++)
	      {
	         if(arr[i]<0)
	            countN++;
	         else if(arr[i]>0)
	            countP++;
	         else
	            countZ++;
	      }
	      
	      System.out.println("\nTotal Positive Number: " +countP);
	      System.out.println("Total Negative Number: " +countN);
	      System.out.println("Total Zero: " +countZ);
	   }
}
