package com.Assignment;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		
		StringBuilder rev = new StringBuilder(str);
		
		rev.reverse();
		
		System.out.println(rev);
	}

}
