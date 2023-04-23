package com.workshop.oop;

class Material {
	public void display () {
		System.out.println("This is a material");
	}
}

class Wood extends Material {
	public void kindOfMaterial() {
		System.out.println("The kind of material is wood");
	}
}

class Chair extends Wood {
	public void legs() {
		System.out.println("Chair has 4 legs");
	}
}

public class MultilevelInheritance {
	public static void main(String args[]) {
		Chair chair = new Chair();
		chair.display();
		chair.kindOfMaterial();
		chair.legs();
	}
}
