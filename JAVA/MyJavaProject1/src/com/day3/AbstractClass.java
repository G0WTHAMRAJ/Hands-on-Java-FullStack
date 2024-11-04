package com.day3;

//AbstractClass=NormalClass+AbstractMethod=>Ac=Nc+Am
abstract class MyAbstractClass{
	
	MyAbstractClass(){
		System.out.println("This is AbstractClass Constructor");
	}
	
	void myMethod1() {
		System.out.println("this is method - 1");
	}
	abstract void myMethod2(); //Declaring method 
	abstract void myMethod3();
	
}
class MyNormalClass extends MyAbstractClass{
	void myMethod2() { //Defining the method by inheriting the abstract class 
		System.out.println("this is method - 2");
	}
	void myMethod3() {
		System.out.println("this is method - 3");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		MyAbstractClass obj1=new MyNormalClass(); // DMD
		obj1.myMethod1();
		obj1.myMethod2();
		obj1.myMethod3();
	

	}

}
