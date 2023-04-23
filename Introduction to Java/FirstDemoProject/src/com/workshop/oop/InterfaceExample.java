package com.workshop.oop;

interface Banks {
	float getROI();
	String name();
}

class HDFC implements Banks {

	@Override
	public float getROI() {
		return 7.1f;
	}

	@Override
	public String name() {
		return "HDFC PVT. LTD.";
	}
	
}

class HSBC implements Banks {

	@Override
	public float getROI() {
		return 8.7f;
	}

	@Override
	public String name() {
		return "HSBC GOVT.";
	}
	
}

public class InterfaceExample {
	public static void main(String args[]) {
		HDFC icici = new HDFC();
		System.out.println(icici.getROI());
		System.out.println(icici.name());
		
		HSBC sbi = new HSBC();
		System.out.println(sbi.getROI());
		System.out.println(sbi.name());
	}
}
