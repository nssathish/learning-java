package com.ssathish.chapter8;

class Box {
	double length;
	double breadth;
	double height;

	Box() {
		this.length = this.breadth = this.height = -1;
	}

	Box(double l, double b, double h) {
		this.length = l;
		this.breadth = b;
		this.height = h;
	}

	Box(double len) {
		this.length = this.breadth = this.height = len;
	}
	
	Box(Box ob) {
		this.length = ob.length;
		this.breadth = ob.breadth;
		this.height = ob.height;
	}
	
	double volume() {
		return length * breadth * height;
	}
}

class BoxWeight extends Box {
	double weight;
	
	public BoxWeight(double l,double b, double h,double w) {
		// TODO Auto-generated constructor stub
		this.length = l;
		this.breadth = b;
		this.height = h;
		this.weight = w;
	}
}

public class DemoBoxWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(2,3,4);
		double vol = box.volume();
		System.out.println("Volume of 2x3x4: " + vol);
		
		BoxWeight boxWeight = new BoxWeight(4, 5, 6, 7);
		vol = boxWeight.volume();
		System.out.println("Volume of boxweight: " + vol);
	}

}
