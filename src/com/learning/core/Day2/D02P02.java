package com.learning.core.Day2;

import java.util.Scanner;
public class D02P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("Even numbers less than or equal to " + num + ":");
        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
