package com.workshop.oop;

interface Parent1 {
	public void display();
}

interface Parent2 {
	public void display1();
}

class Child implements Parent1, Parent2 {
	@Override
	public void display1() {
		System.out.println("Inherited this from Parent 2");
		
	}
	@Override
	public void display() {
		System.out.println("Inherited this from Parent 1");
	}
}

public class MultipleInheritanceClass {
	public static void main(String args[]) {
		Child c = new Child();
		c.display();
		c.display1();
	}
}
