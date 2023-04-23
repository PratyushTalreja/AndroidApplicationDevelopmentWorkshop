package com.workshop.exception;

public class ArithmeticExceptionExample {
	public static void main(String args[]) {
		int a = 3, b = 0;
		try {
			System.out.println(a/b);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The program is completed");
	}
}
