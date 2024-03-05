package com.learning.core.Day2;
import java.util.Scanner;

public class D02P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        long powerof = 1;

        for (int i = 1; i <= exponent; i++) {
            powerof *= base;
        }

        System.out.printf("power of given no = %d%n",powerof);
    }
}

