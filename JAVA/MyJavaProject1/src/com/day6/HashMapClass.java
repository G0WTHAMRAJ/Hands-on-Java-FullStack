package com.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) { //Unordered Collection,null key is allowed only once because no duplicate is supported
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(21,"Raj");
		hm.put(2,"Niv");
		hm.put(4,"Raj");
		hm.put(6,"Niv");
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
