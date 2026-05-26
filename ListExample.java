package com.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits	= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Grapes");
		fruits.add(null);
		
		ListIterator<String> iterator = fruits.listIterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		// TODO -- In the backward direction
		
		//Iterator<String> it = fruits.iterator();
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
