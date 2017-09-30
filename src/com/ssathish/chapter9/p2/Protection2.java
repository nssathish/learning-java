package com.ssathish.chapter9.p2;

import com.ssathish.chapter9.p1.Protection;

public class Protection2 extends Protection {
	public Protection2() {
		System.out.println("other package derived constructor");
		
//		System.out.println("protection2 default: " + default_i);
//		System.out.println("protection2 private: " + private_i);
		System.out.println("protection2 protect: " + protect_i);
		System.out.println("protection2 public: " + pub_i);
	}
}
