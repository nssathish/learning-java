package com.ssathish.chapter7;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello Techgighg";
		String search = "hg";
		if (name.substring(name.length()-search.length()).equals(search)) {
			System.out.println(true);
		}
		int count = 0;
		while(true) {
			if (name.indexOf(search) >= 0) {
				name = name.replaceFirst(search,"");
				++count;
			}
			else {
				break;
			}
		}
		//System.out.println(count);
		
		System.out.println(name.lastIndexOf(search));
		System.out.println(name.length());
		System.out.println(search.length());
		System.out.println(name.substring(name.length()-search.length()));
	}

}
