package com.learning.core.Day2;

import java.util.Scanner;

public class D02P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int n = sc.nextInt();

        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        if (n >= 1 && n <= 12) {
            String monthName = monthNames[n - 1];
            System.out.println("The month corresponding to " + n + " is " + monthName + ".");
        } else {
            System.out.println("Invalid input.");
        }
    }
}




