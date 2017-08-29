package com.ssathish.chapter8;

class Material {
	double side,length,breadth;
	
	public void area() {
		System.out.println("Material class show");
	}
}

class Square extends Material {
	Square() {
		side = -1;
	}
	Square(double len) {
		side = len;
	}
	
	public void area() {
		System.out.println("Area of square: " + (side * side));
	}
}

class Rectangle extends Material {
	Rectangle() {
		length = -1;
		breadth = -1;
	}
	Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}
	public void area() {
		System.out.println("Area of rectangle: " + (length * breadth));
	}
}
public class AreaOfMaterials {
	public static void main(String[] args) {
		Square s = new Square(5);
		s.area();
		
		Rectangle r = new Rectangle(8,9);
		r.area();
	}
}
