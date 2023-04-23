package com.workshop.oop;

class Animal {
	public void run() {
		System.out.println("Animal is running");
	}
}

class Frog extends Animal {
	public void run() {
		System.out.println("Frog is jumping");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		Frog f = new Frog();
		f.run();
	}
}