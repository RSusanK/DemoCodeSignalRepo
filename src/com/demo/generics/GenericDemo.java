package com.demo.generics;

//Java Program to illustrate generic class hierarchies

//Importing all input output classes
import java.io.*;

//Helper class 1
//Class 1 - Parent class
class Generic1<T> {
	// Member variable of parent class
	T obj;

	// Constructor of parent class
	Generic1(T o1) {
		obj = o1;
	}

	// Member function of parent class
	// that returns an object
	T getobj1() {
		return obj;
	}
}

//Helper class 2
//Class 2 - Child class
class Generic2<T, V> extends Generic1<T> {
	// Member variable of child class
	V obj2;

	Generic2(T o1, V o2) {
		// Calling super class using super keyword
		super(o1);

		obj2 = o2;
	}

	// Member function of child class
	// that returns an object
	V getobj2() {
		return obj2;
	}
}

//Class 3 - Main class
class GenericDemo {

	// Main driver method
	public static void main(String[] args) {
		// Creating Generic2 (sub class) object
		// Custom inputs as parameters
		Generic2<String, Integer> x = new Generic2<String, Integer>("value : ", 100);

		// Calling method and printing
		System.out.println(x.getobj1());
		System.out.println(x.getobj2());
	}
}
