package com.day3;


class SuperClass{ /* overriding static method which is not possible ,
					it will display superClass method
					replacing superClass functionality by subClass */
	static void myMethod() {
		System.out.println("SuperClass");
		
	}
	
}
class SubClass extends SuperClass{
	static void myMethod() {
		System.out.println("SubClass");
	}
	
	
}
public class OverLoadingClass { 
	

	public static void main(String[] args) {
		SuperClass obj1=new SubClass();
		obj1.myMethod();
		

	}

}