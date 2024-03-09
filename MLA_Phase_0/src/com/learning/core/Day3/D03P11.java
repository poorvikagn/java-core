package com.learning.core.Day3;

	import java.util.*;
	public class D03P11 {

	    public static List<String> findMatchedWords(String[] dict, String pattern) {
	        List<String> result = new ArrayList<>();
	        Map<Character, Integer> patternMap = new HashMap<>();
	        StringBuilder patternHash = new StringBuilder();

	        	        int i = 0;
	        for (char ch : pattern.toCharArray()) {
	            if (!patternMap.containsKey(ch)) {
	                patternMap.put(ch, i++);
	            }
	            patternHash.append(patternMap.get(ch));
	        }

	    
	        for (String word : dict) {
	            if (word.length() == pattern.length()) {
	                Map<Character, Integer> wordMap = new HashMap<>();
	                StringBuilder wordHash = new StringBuilder();

	                i = 0;
	                for (char ch : word.toCharArray()) {
	                    if (!wordMap.containsKey(ch)) {
	                        wordMap.put(ch, i++);
	                    }
	                    wordHash.append(wordMap.get(ch));
	                }

	                if (wordHash.toString().equals(patternHash.toString())) {
	                    result.add(word);
	                }
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String[] dict = {"abb", "abc", "xyz", "xyy"};
	        String pattern = "foo";

	        List<String> matchedWords = findMatchedWords(dict, pattern);
	        if (matchedWords.isEmpty()) {
	            System.out.println("Output: No");
	        } else {
	            System.out.print("Output: ");
	            for (String word : matchedWords) {
	                System.out.print(word + " ");
	            }
	        }
	    }
	}
