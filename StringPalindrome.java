package com.Assignment;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		
		String rev = "";
		boolean valid = false;
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev +str.charAt(i);
		}
		//System.out.println(rev.toString());
		if(str.equals(rev)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
