package com.ssathish.chapter9.p1;

public class Derived extends Protection {
	public Derived() {
		System.out.println("Derived class' constructor");
		System.out.println("derived default i: " + default_i);
		//class can only access 
//		System.out.println("derived private i: " + private_i);
		System.out.println("derived protected i: " + protect_i);
		System.out.println("derived public i: " + pub_i);
	}
}