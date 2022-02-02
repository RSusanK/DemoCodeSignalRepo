package com.demo;

public class CountOccurenceStreams {

	public static void main(String[] args) {
		String str =" I love coding";
		countOccurence(str);
	}

	private static void countOccurence(String str) {
		//Step 1
		System.out.println(
				str.chars().filter(e->e==(char)'o')
				.count()
				);
	}

}
