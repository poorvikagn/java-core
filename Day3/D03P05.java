package com.learning.core.Day3;
	import java.util.ArrayList;
	import java.util.Arrays;

	public class D03P05 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        int k = 2;

	        ArrayList<ArrayList<Integer>> result = findCombinations(arr, k);

	        
	        for (ArrayList<Integer> combination : result) {
	            System.out.print(combination + " ");
	        }
	    }

	    private static ArrayList<ArrayList<Integer>> findCombinations(int[] arr, int k) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        Arrays.sort(arr); 
	        backtrack(result, new ArrayList<>(), arr, k, 0);
	        return result;
	    }

	    private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int[] arr, int k, int start) {
	        if (k == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < arr.length; i++) {
	            current.add(arr[i]);
	            backtrack(result, current, arr, k - 1, i + 1);
	            current.remove(current.size() - 1);
	        }
	    }
	}
