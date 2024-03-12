package com.learning.core.Day2;

import java.util.Scanner;

	public class D02P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxNumber;

        if (num1 >= num2 && num1 >= num3) {
            maxNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maxNumber = num2;
        } else {
            maxNumber = num3;
        }

        System.out.println("Maximum number is: " + maxNumber);
    }
}
