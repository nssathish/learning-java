package com.ssathish.chapter7;

class Test {
	int a;
	
	Test(int i) {
		this.a = i;
	}
	
	Test incrByTen() {
		Test temp = new Test(a + 10);
		return temp;
	}
}
public class ReturningObjects {

	public static void main(String[] args) {
		Test ob1 = new Test(5);
		Test ob2 = ob1.incrByTen();
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob2.a: " + ob2.a);
		ob2 = ob2.incrByTen();
		System.out.println("ob2.a increased by ten: " + ob2.a);
	}
}
