package com.ssathish.chapter9.p1;

public class Protection {
	int default_i = 1;
	private int private_i = 2;
	protected int protect_i = 3;
	public int pub_i = 4;
	
	public Protection() {
		System.out.println("Using the base constructor");
		System.out.println("default i: " + default_i);
		System.out.println("pricate i: " + private_i);
		System.out.println("protected i: " + protect_i);
		System.out.println("public i:" + pub_i);
	}
}
