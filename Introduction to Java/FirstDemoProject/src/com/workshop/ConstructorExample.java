package com.workshop;

class Employee1 {
	int i;
	Employee1() {
		System.out.println("Employee object is created");
	}
	
	Employee1(int a) {
		i = a;
	}
	
	public void display() {
		System.out.println("The value of i is " + i);
	}
	
}


public class ConstructorExample {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.display();
		Employee1 emp1 = new Employee1(123);
		emp1.display();
	}

}
