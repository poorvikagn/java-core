package com.learning.core.Day6;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class D06P02 {
    public static void main(String[] args) {
       
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

      
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");
        Scanner scanner= new Scanner(System.in);
        
        String nameToSearch = scanner.nextLine();
        String phoneNumber = phoneBook.get(nameToSearch);
      
        if (phoneNumber != null) {
            System.out.println (phoneNumber);
        } else {
            System.out.println("No entry found for " + nameToSearch);
        }
        }
    }

