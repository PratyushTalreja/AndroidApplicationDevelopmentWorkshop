package com.workshop.oop;

class Student {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationExample {
	public static void main(String args[]) {
		Student s = new Student();
		s.setName("Pratyush");
		System.out.println(s.getName());
	}
}
