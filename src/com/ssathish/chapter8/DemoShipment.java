package com.ssathish.chapter8;

class SBox {
	double length,breadth,height;
	
	SBox() {
		length = breadth = height = -1;
	}
	
	SBox(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
	}
	
	SBox(double len) {
		length = breadth = height = len;
	}
	
	double volume () {
		return length * breadth * height;
	}
}

class SBoxWeight extends SBox {
	double weight;
	
	SBoxWeight() {
		super();
		weight = -1;
	}
	
	SBoxWeight(double l, double b, double h, double w) {
		super(l,b,h);
		weight = w;
	}
	
	SBoxWeight(double len, double weight) {
		super.length = super.breadth = super.height = len;
		this.weight = weight;
	}
	
	SBoxWeight(SBox ob) {
		length = ob.length;
		breadth = ob.breadth;
		height = ob.height;
		weight = -1;
	}
}

class Shipment extends SBoxWeight {
	double cost;
	
	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}
	
	Shipment() {
		super();
		cost = -1;
	}
	
	Shipment(double l, double b, double h, double w, double c) {
		super(l,b,h,w);
		this.cost = c;
	}
	
	Shipment(double len, double w, double c) {
		super(len,w);
		this.cost = c;
	}
}

public class DemoShipment {

	public static void main(String[] args) {
		Shipment shipment = new Shipment(2,3,4,5,1.1);
		System.out.println("volume: " + shipment.volume() + " the cost is: " + shipment.cost);
	}

}
