package com.day6;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
	HashSet<Integer> hs =new HashSet<>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	hs.add(10);
	System.out.println(hs);
	
	//Traversing method-1
	System.out.println("Method-1");
	for(Integer i:hs) {
		System.out.println(i);
	}
	//Traversing method-1
	System.out.println("Method-2");
	Iterator<Integer> it =hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	} 

}
