package com.day6;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map.Entry;

public class SortedMapClass {

	public static void main(String[] args) { //Unordered Collection,null key is allowed only once because no duplicate is supported
		SortedMap<Integer,String> hm=new TreeMap<>(Collections.reverseOrder());//Allocating in reverse order
//		SortedMap<Integer,String> hm=new TreeMap<>();
		hm.put(21,"Raj");
		hm.put(2,"Niv");
		hm.put(4,"Raj");
		hm.put(6,"Niv");
//		hm.put(null,"Niv"); will not allow null key
//		hm.put(105,"null"); will not allow null value
		System.out.println(hm);
		System.out.println(hm.get(4));
		
		//Way-1 traversing the elements
		System.out.println("Method-1");
		Set<Integer> keys=hm.keySet();
		for(Integer k:keys) {
			System.out.println(k+" => "+hm.get(k));
		}
		System.out.println("Method-2 using Entry");
		Set<Entry<Integer,String>> set =hm.entrySet();
		for(Entry<Integer,String> entry:set) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
	}

}
