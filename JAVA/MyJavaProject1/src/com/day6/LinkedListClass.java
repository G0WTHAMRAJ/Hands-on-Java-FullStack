package com.day6;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> list =new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.remove(2);
		System.out.println(list);
		list.remove(new Integer(20));
		System.out.println(list);
		
		//traversing element method-1
		System.out.println("method-1");
		for (int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("method-2");
		//traversing element method-1
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("method-3");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
