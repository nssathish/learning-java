package com.ssathish.chapter9.p1;

public class SomePackage {
	public SomePackage() {
		Protection p = new Protection();
		System.out.println("non derived some package class constructor");
		System.out.println("somepackage default i" + p.default_i);
		//can be access from inside the class (or) via methods in class
//		System.out.println("somepackage private i:" + p.private_i);
		System.out.println("somepackage protect i:" + p.protect_i);
		System.out.println("somepackage public i:" + p.pub_i);
	}
}