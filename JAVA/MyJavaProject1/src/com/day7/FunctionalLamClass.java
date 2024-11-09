package com.day7;

interface MyInter{
	int calculate(int a,int b);
}

public class FunctionalLamClass {

	public static void main(String[] args) {
		MyInter ref=(a,b)->a+b;
		System.out.println(ref.calculate(100, 200));
		
		ref=(a,b)->a-b;
		System.out.println(ref.calculate(60, 10));
		
		

	}

}
