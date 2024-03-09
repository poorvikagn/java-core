package com.learning.core.Day5;
import java.util.ArrayList;
import java.util.Scanner;
public class D05P02 {
	    public static void main(String[] args) {
	       
	        ArrayList<String> studentList = new ArrayList<>();

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the list of student names separated by spaces:");
	        String inputNames = scanner.nextLine();

	        String[] namesArray = inputNames.split(" ");
	        for (String name : namesArray) {
	            studentList.add(name);
	        }

	        System.out.println("Enter the name to search:");
	        String searchName = scanner.nextLine();

	        if (studentList.contains(searchName)) {
	            System.out.println("Found");
	        } else {
	            System.out.println("Not Found");
	        }
	    }
	}
