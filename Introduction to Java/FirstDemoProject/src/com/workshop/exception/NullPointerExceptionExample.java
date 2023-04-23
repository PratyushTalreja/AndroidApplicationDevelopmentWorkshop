package com.workshop.exception;

public class NullPointerExceptionExample {
	public static void main(String args[]) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program implementation is complete");
	}
}
