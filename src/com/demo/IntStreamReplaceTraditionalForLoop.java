package com.demo;

import java.util.stream.IntStream;

public class IntStreamReplaceTraditionalForLoop {
	
	public static void main(String[] args) {
		intStreamDemo();
		palindromeOrNot("madam1");
		int[] ar = {10,2,3,4,5,6};
		
		
		intArrayToStream(ar);
		String s="a123";
		System.out.println(" String to Integer ");
		System.out.println("Replaced " + s.replaceAll("[^0-9]", ""));
		int value = Integer.parseInt(s.replaceAll("[^0-9]", ""));
		System.out.println(value);
		//System.out.println(Integer.parseInt(s));
		
		String str2 = "12123";
		System.out.println("Integer.valueof");
		System.out.println(Integer.valueOf(str2));
		
	}
	

	private static void intArrayToStream(int[] ar) {
		System.out.println(" Printing int Array to Stream ");
		IntStream.of(ar).forEachOrdered(System.out::println);
	}


	private static void palindromeOrNot(String str) {
		int length = str.length();
		
		boolean count = IntStream.range(0, length/2)
		.noneMatch(e-> str.charAt(e) == str.charAt(length-e-1) );
		if(count)
			System.out.println("not a palindrome");
		else
			System.out.println("palindrome");
		// str.chars().mapToObj(c->(char)c)
		// .in
		;
		
	}

	private static void intStreamDemo() {
		IntStream.rangeClosed(0, 10)
		.forEach(System.out::println);
	}

}
