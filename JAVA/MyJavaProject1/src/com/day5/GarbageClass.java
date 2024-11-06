package com.day5;

public class GarbageClass {
	static int count =1;
	
	GarbageClass(){
		count++;
		System.out.println(count);
	}
	protected void finalize() {
		count--;
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		
		GarbageClass obj1=new GarbageClass();
		GarbageClass obj2=new GarbageClass();
		obj1=null;
		obj2=null;
		System.gc();
		Runtime.getRuntime().gc();
		

	}

}
