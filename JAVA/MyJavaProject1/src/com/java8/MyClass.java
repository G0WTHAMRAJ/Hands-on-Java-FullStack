package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyClass {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,9,5,10,2,3,6,4,11,19,101,121,11,141);
		List<Integer> oddList=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
		
		List<Integer> oneList=list.stream().filter(x->String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(oneList);
		
		List<Integer> oneEnd=list.stream().filter(x->String.valueOf(x).endsWith("1")).collect(Collectors.toList());
		System.out.println(oneEnd);
		
		List<Integer> dupList=list.stream().filter(x->list.indexOf(x)!=list.lastIndexOf(x)).collect(Collectors.toList());
		System.out.println(dupList);
		
		Set<Integer> dupList1=list.stream().filter(x->list.indexOf(x)!=list.lastIndexOf(x)).collect(Collectors.toSet());
		System.out.println(dupList1);
		
		Set<Integer> set=new HashSet<Integer>();
		long dupCount=list.stream().filter(x->set.add(x)==false).count();
		System.out.println(dupCount);
		
		int firstElement=list.stream().findFirst().get();
		System.out.println(firstElement);
		
		int count=(int)list.stream().count();
		System.out.println(count);
		
		int max=list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
		int maX=list.stream().max((x,y)->x-y).get();
		System.out.println(maX);
		
		List<Employee> emp=Arrays.asList(
				new Employee(101,"jai",8000),
				new Employee(102,"akash",100000),
				new Employee(103,"Cookie",2000));
		List<Employee> sortedEmp=emp.stream().sorted((e1,e2)->e1.salary-e2.salary).collect(Collectors.toList());
		System.out.println(sortedEmp);
		
		List<Employee> sortedEmp1=emp.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		System.out.println(sortedEmp1);
		
		set.clear();
		boolean isDuplicate=list.stream().filter(x->set.add(x)==false).count()>0?true:false;
		System.out.println(isDuplicate);
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		List<Integer> factList=list1.stream().map(x->{
			int fact = 1;
			for(int i=1;i<x;i++) 
				fact=fact*i;
			return fact;
			
		}).collect(Collectors.toList());
		System.out.println(factList);
		
		int arr[]= {10,3,41,34,98};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}
	


}
