package com.day1;

public class MyClass2 {
	
	
	 int a=10; //Changing Instance value using obj 
	//int a =10 changing static variable value using obj which is not correct way we should access using class name 
	public static void main(String[] args) {
		MyClass2 obj1=new MyClass2();
		MyClass2 obj2=new MyClass2();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;

		System.out.println(obj1.a);
		System.out.println(obj2.a);

	}

}
