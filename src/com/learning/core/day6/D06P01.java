package com.learning.core.Day6;
import java.util.LinkedHashMap;

public class D06P01 {
    public static void main(String[] args) {
       
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

      
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");
      
        for (String name : phoneBook.keySet()) {
            String phoneNumber = phoneBook.get(name);
            System.out.println(name + " " + phoneNumber);
        }
    }
}