package com.learning.core.Day1;

class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}