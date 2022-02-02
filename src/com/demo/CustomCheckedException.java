package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomCheckedException {

	public static void main(String[] args) {

		try {
			checkCustomException();
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
	}

	private static String checkCustomException() throws IncorrectFileNameException {
		String fileName = "abc.txt";
		try (Scanner file = new Scanner(new File(fileName))) {
			if (file.hasNextLine())
				return file.nextLine();
		} catch (FileNotFoundException e) {
			// if (!isCorrectFileName(fileName)) {
			throw new IncorrectFileNameException("Incorrect filename : " + fileName);
			// }
			// ...
		}
		return fileName;
	}

}

class IncorrectFileNameException extends Exception {

	public IncorrectFileNameException() {
		super();
		System.out.println("Default Constr");
	}

	public IncorrectFileNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		System.out.println();
	}

	public IncorrectFileNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectFileNameException(String message) {
		super(message);
	}

	public IncorrectFileNameException(Throwable cause) {
		super(cause);
	}

}
