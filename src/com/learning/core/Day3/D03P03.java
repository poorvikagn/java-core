package com.learning.core.Day3;
import java.util.Scanner;
public class D03P03 {
    public static void main(String[] args) {
        
        int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        System.out.println("Enter the numbers:");
        Scanner sc = new Scanner(System.in);
        		
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;

       
        double average = (double) sum / 15;
        A[16] = (int) Math.round(average);

        int smallest = A[0];
        for (int i = 1; i < 15; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        A[17] = smallest;

        
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
