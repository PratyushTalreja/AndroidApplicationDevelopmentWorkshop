package com.workshop.oop;

class Addition {
	
	public void addTwoNumbers() {
		System.out.println("No arguments");
	}
	
	public int addTwoNumbers (int a, int b) {
		return a + b;
	}
	
	public double addTwoNumbers (double a, double b) {
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String args[]) {
		Addition add = new Addition();
		add.addTwoNumbers();
		System.out.println(add.addTwoNumbers(2, 9));
		System.out.println(add.addTwoNumbers(1.4, 2.6));
	}
}
