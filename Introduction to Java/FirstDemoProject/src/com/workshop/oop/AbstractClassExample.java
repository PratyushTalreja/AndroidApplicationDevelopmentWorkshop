package com.workshop.oop;

abstract class Bank {
	abstract void getROI();
	public void display() {
		System.out.println("This is a bank");
	}
}

class ICICI extends Bank {
	public void getROI() {
		System.out.println("The rate of interest is 7.1%");
	}
}

class SBI extends Bank {

	@Override
	void getROI() {
		System.out.println("Rate of interest is 8.1%");
	}
	
}

public class AbstractClassExample {
	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.display();
		icici.getROI();
	}

}
