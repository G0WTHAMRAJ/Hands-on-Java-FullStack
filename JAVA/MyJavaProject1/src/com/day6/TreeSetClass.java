package com.day6;      
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
	TreeSet<Integer> hs =new TreeSet<>(Collections.reverseOrder()); //to allocate in reverse order
	//TreeSet<Integer> hs =new TreeSet<>()); 
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
                              