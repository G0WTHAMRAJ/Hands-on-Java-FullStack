package com.day1;

public class ClassMethod {
	//two types of method 
	void myMethod() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static or class method");
	}

	public static void main(String[] args) {
		
		ClassMethod obj=new ClassMethod();
		obj.myMethod();
		ClassMethod.myMethod2();
		
		
	}

}
