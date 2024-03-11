package com.learning.core.Day2;

import java.util.Scanner;
public class D02P10 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter an integer: ");
     int num = sc.nextInt();

     int reversed = 0;
     while (num != 0) {
         int digit = num % 10; 
         reversed = reversed * 10 + digit; 
         num /= 10; 
     }
     
     System.out.println("Reversed Number: " + reversed);
     sc.close();
 }
}

