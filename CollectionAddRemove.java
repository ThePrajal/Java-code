package com.Assignment;

import java.util.*;

public class CollectionAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Grapes");
		fruits.add("Papaya");
		
		System.out.println(fruits.toString());
		
		fruits.remove("Banana");
		
		System.out.println(fruits.toString());
		
		fruits.removeAll(fruits);
		fruits.add("Mango");
		System.out.println(fruits);
	}

}
