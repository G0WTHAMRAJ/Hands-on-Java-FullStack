package com.day7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,11,12,13,14,15);
		System.out.println(list);
		List<Integer> evenList=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		List<Integer> mulList=list.stream().map(x->x*2).collect(Collectors.toList());
		System.out.println(mulList);
		List<String> names=Arrays.asList("Raj","Nivy","John");
		System.out.println(names);
		Map<String,Integer>map=names.stream().collect(Collectors.toMap(x->x, x->x.length()));
		System.out.println(map);
	}

}
