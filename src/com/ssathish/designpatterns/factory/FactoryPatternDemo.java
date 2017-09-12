package com.ssathish.designpatterns.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape chosenShape = factory.getShape("circle");
		chosenShape.draw();
		
		chosenShape = factory.getShape("square");
		chosenShape.draw();
		
		chosenShape = factory.getShape("rectangle");
		chosenShape.draw();
	}

}
