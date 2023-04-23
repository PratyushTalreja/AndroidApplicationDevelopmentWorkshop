package com.workshop.exception;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String args[]) {
		String names[] = {"Pratyush", "Cookoo"};
		try {
			System.out.println(names[2]);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Names are printed");
	}
}
