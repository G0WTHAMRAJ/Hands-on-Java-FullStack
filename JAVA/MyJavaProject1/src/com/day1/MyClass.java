package com.day1;
//types of variable in java 
public class MyClass {
	int b;// Instance or object variable
	static int c;//Static or class variable
	
	public static void main(String[] args) {
		int a = 10;//local variable
		System.out.println(a);
		
		MyClass obj=new MyClass();
		System.out.println(obj.b);
		
		System.out.println(MyClass.c);
		
		

	}

}
