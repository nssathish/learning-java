package com.ssathish.designpatterns.factory;

public class ShapeFactory {
	String shape;

	Shape getShape (String shape) {
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else {
			return null;
		}
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("You have chosen to draw square");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("You have chosen to draw rectangle");
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("You have chosen to draw a circle");
	}
}