package com.ssathish.chapter8;

class XBox {
	private double length,breadth,height;
	
	XBox() {
		length = -1;
		breadth = -1;
		height = -1;
	}
	XBox(double l,double b,double h) {
		length = l;
		breadth = b;
		height = h;
	}
	XBox(double len) {
		length = breadth = height = len;
	}
	
	double volume() {
		return length * breadth * height;
	}
}
class XBoxWeight extends XBox {
	double weight;
	
	XBoxWeight() {
/*		length = -1;
		breadth = -1;
		height = -1;
*/		
		super();
		weight = -1;
	}
	
	XBoxWeight(double l,double b,double h,double w) {
/*		length = l;
		breadth = b;
		height = h;*/
		super(l,b,h);
		weight = w;
	}
	
	XBoxWeight(double len) {
		//super.length = super.breadth = super.height = len;
		super(len);
	}

	double volume() {
		System.out.println("calling xboxweight's volume");
		return 0.0;
	}
}
public class RefDemo {

	public static void main(String[] args) {
		XBox plainBox = new XBox();
		XBoxWeight weightBox = new XBoxWeight(2,3,4,2.7);
		
		System.out.println(weightBox.volume() + " " + weightBox.weight);
		
		plainBox = weightBox;
		System.out.println(plainBox.volume());
	}

}
