package com.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateOccurence {

	public static void main(String[] args) {

		String str = "successes"; 
		//countOccurence(str);
		countOccurenceStreams(str);
	}

	private static void countOccurenceStreams(String str) {
	System.out.println(" Collecting elements ");
		str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
		.forEach(e->System.out.println(e.getKey() +" "+ e.getValue()));
		;
		
		
		Map<Character, Long> charCount = str.chars()
				.mapToObj(i->(char)i)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
	}

	private static void countOccurence(String str) {
		Map<Character, Integer> mapStr = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (!mapStr.containsKey(ch)) {
				mapStr.put(ch, 1);
			} else {
				mapStr.put(ch, mapStr.get(ch) + 1);
			}
		}
		System.out.println(mapStr);

	}

}
