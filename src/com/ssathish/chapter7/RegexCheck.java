package com.ssathish.chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Pattern pat = Pattern.compile("^[a-zA-Z]+$");
		Matcher mat = pat.matcher(input1);*/
		
		String input1 = "This Sathish";
		System.out.println(Pattern.matches("([A-Z][a-z]+\\s*)+", input1));
	}

}
