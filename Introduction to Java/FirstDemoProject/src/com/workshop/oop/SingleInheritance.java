package com.workshop.oop;


class Vehicle {
	public void display() {
		System.out.println("This is a vehicle");
	}
}

class Car extends Vehicle {
	public void wheels() {
		System.out.println("It has 4 wheels");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		c.wheels();
	}

}
