package com.day3;

//Multiple Inheritence 

interface One{
	int a =10;
}
interface Two {
	int a=20;
}
interface Three extends One,Two{
	void sum();
}

class NormalClass1 implements Three{
	public void sum() {
		System.out.println(One.a+Two.a);
	}
	
}
public class AmbigiousClass {

	public static void main(String[] args) {
		NormalClass1 obj1 = new NormalClass1();
		obj1.sum();
		

	}

}
