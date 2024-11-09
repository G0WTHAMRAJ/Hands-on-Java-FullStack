package com.day6;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer> vec =new Vector<>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		vec.remove(2);
		System.out.println(vec);
		vec.remove(new Integer(20));
		System.out.println(vec);
		
		//traversing element method-1
		System.out.println("method-1");
		for (int i = 0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
		System.out.println("method-2");
		//traversing element method-2
		for(Integer i:vec) {
			System.out.println(i);
		}
		//traversing element method-3

		System.out.println("method-3");
		Iterator<Integer> it=vec.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//traversing element method-4
		System.out.println("method-4");
		Enumeration<Integer> er=vec.elements();
		while(er.hasMoreElements()) {
			System.out.println(er.nextElement());
		}

	}

}
