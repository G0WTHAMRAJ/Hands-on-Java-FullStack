package com.day7;


interface MyInterface1{
	void myMethod();
}
 
 
public class MethodRefClass {
	void Method1() {
		System.out.println("instance ");
	}
	MethodRefClass() {
		System.out.println("constructor");
	}
	static void method2() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		MethodRefClass obj = new MethodRefClass();
		MyInterface1  ref = obj :: Method1;
		ref.myMethod();
		ref=MethodRefClass::method2;
		ref.myMethod();
		ref=MethodRefClass::new;
		ref.myMethod();

	}
 
}
