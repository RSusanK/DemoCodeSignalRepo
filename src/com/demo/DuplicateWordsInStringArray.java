package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInStringArray {

	public static void main(String[] args) {

		String[] wordsList = {"amazon","amazon","long","java","java"};
		
		duplicateWordsInStrArray(wordsList);
	}

	private static void duplicateWordsInStrArray(String[] wordsList) {
		//Typical Map approach:
		Map<String,Integer> mapStr = new HashMap<>();
		for(String str:wordsList) {
			if(mapStr.containsKey(str)) {
				mapStr.put(str, mapStr.get(str)+1);
			}
			else {
				mapStr.put(str, 1);
			}
		}
		//System.out.println("Map entries "+ mapStr);
		
		Set<Entry<String,Integer>> entrySet = mapStr.entrySet();
		System.out.println("Duplicate entries through normal map is ");
		for( Entry<String,Integer> entry: entrySet) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
		
		
		
		//1. HashSet approach
		System.out.println(" Using Set ");
		Set<String> strSet = new HashSet<>();
		Set<String> setStr = Arrays.asList(wordsList).stream()
				.filter(str->!strSet.add(str))
		
		.collect(Collectors.toSet()) ;
		System.out.println(setStr);
		//3. Streams -->grouping by
		System.out.println("Streams grouping by");
		
		List<String> wrdsList = Arrays.asList(wordsList);
		List<String> strList = wrdsList.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream().filter(e->e.getValue()>1)
		.map(e->e.getKey())
		.collect(Collectors.toList());
		System.out.println(strList);
		//System.out.println(mapArr);
		
		//Streams--Frequency Method
		System.out.println(" Using Frequency method ");
		Set<String> finalList = wrdsList.stream().filter(e->Collections.frequency(wrdsList, e)>1)
		.collect(Collectors.toSet());
		System.out.println(finalList);
		
	}

}
