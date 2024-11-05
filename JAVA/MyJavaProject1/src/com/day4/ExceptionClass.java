package com.day4;

public class ExceptionClass {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
		//int a =10/0; throw new ArithmeticException()
			int a =Integer.parseInt("abc");
		}catch(ArithmeticException e) {
			System.out.println("A");
		}catch(NumberFormatException e) {
			System.out.println("C");
		}
		catch (Exception e) { //Handling global exception using Exception  will handle all the Exception 
			System.out.println("D");
		}
		System.out.println("After Exception");
	}

}
