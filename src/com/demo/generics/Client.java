package com.demo.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		Container<Integer, String> c = new Container<>(10, "abc");
		int i = c.getItem1();
		String j = c.getItem2();
		Set<String> e1 = new HashSet<>();
		e1.add("a");
		e1.add("b");
		e1.add("c");
		
		Set<String> e2 = new HashSet<>();
		e2.add("a");
		e2.add("b");
		e2.add("v");
		union(e1,e2);
	}

	public static <E> Set<E> union(Set<E> E1, Set<E> E2) {

		Set<E> s1 = new HashSet<>(E1);
		s1.addAll(E2);
		
		Iterator<E> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		return s1;

	}

}
