package com.day4;
import java.util.Scanner;


class InvalidAgeException extends Exception{
	public String toString() {
		return "Invalid Age for vote";
	}
	
}
public class ThrowClass {

	public static void main(String[] args) {
		
		try {
		System.out.println("Enter the age :");
		int age = new Scanner(System.in).nextInt();
		if(age<18) {
			throw new InvalidAgeException();
		}else {
			System.out.println("Welcome to vote");
		}
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
