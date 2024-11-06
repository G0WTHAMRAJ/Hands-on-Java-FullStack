package com.day5;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Object> list =new ArrayList<>();
		list.add(10);
		list.add("Gowtham");
		list.add(2.0f);
		list.add('G');
		System.out.println(list.get(0));
		System.out.println(list.size());
		for(Object o:list)
			System.out.println(o);
		list.remove(2);
		for(Object o:list)
			System.out.println(o);


	}

}
