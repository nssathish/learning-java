package com.ssathish.chapter9.p2;

import com.ssathish.chapter9.p1.Protection;

public class OtherPackage {
	public OtherPackage () {
		Protection pro = new Protection();
		System.out.println("Other package constructor");
		
//		System.out.println("protection default: " + pro.default_i);
//		System.out.println("protection private: " + pro.private_i);
//		System.out.println("protection protected: " + pro.protect_i);
		System.out.println("other package2 public: " + pro.pub_i);
	}
}
