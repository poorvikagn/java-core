package com.learning.core.Day1;

public class TestClass {
	    public static void main(String[] args) {
	        
	        MedicineInfo[] medicines = {new Tablet(), new Syrup(), new Ointment()};

	        
	        for (MedicineInfo medicine : medicines) {
	            medicine.displayLabel();
	        }
	    }
}
