package com.learning.core.Day3;

import java.util.ArrayList;
import java.util.List;
public class D03P14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        findUnionAndIntersection(arr1, arr2);
    }

    private static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        List<Integer> unionList = new ArrayList<>();
        List<Integer> intersectionList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                unionList.add(arr1[i]);
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            unionList.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            unionList.add(arr2[j]);
            j++;
        }

        System.out.println("Union: " + unionList);
        System.out.println("Intersection: " + intersectionList);
    }
}