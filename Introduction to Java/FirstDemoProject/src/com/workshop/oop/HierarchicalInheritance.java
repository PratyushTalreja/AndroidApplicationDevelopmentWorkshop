package com.workshop.oop;

class Furniture {
	public void display () {
		System.out.println("This is a furniture");
	}
}

class Chair1 extends Furniture {
	public void show () {
		System.out.println("Chair is a child of furniture");
	}
}

class Table extends Furniture {
	public void print() {
		System.out.println("Table is a child of Furniture");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Chair1 chair = new Chair1 ();
		chair.display();
		chair.show();
		
		Table table = new Table();
		table.display();
		table.print();
	}

}
