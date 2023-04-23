package com.workshop;

/**
 * @author Pratyush
 *
 */

class Employee {
	String name = "Pratyush";
	int empId = 123;

	public void display() {
		System.out.println("The name of the employee is " + name + " and the employee Id of the employee is " + empId);
	}
}

public class ClassExample {
	public static void main(String[] args) {
		// Creating an object - ClassName objectName = new ClassName();
		Employee empObj = new Employee();
		// Calling method using object - objectName.methodName();
		empObj.display();
	}
}
