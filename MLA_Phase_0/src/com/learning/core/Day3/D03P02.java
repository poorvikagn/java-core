package com.learning.core.Day3;
import java.util.Scanner;
public class D03P02 {
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter an array of 5 numbers between 1 and 40 : ");
			int[] arr= new int[5];
			for(int j=0; j<5; j++)
			{
				arr[j]=sc.nextInt();
			}
			System.out.println("Enter 2 numbers between 1 and 40 : ");
			int n=sc.nextInt();
			int m=sc.nextInt();
			int c=0,d=0;
			for(int i: arr)
			{
				if(i==n)
				{
					c++;
				}
				if(i==m)
				{
					d++;
				}
			}
			if(c>0 && d>0)
			{
				System.out.println("Its Bingo");
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}

