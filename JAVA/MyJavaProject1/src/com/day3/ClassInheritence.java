package com.day3;


class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheel extends Vehicle{ //Single Inheritence 
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheel{ //Multi level Inheritence
	void brandName() {
		System.out.println("the brand is Honda");
	}
}


public class ClassInheritence {

	public static void main(String[] args) {
		TwoWheel Obj1=new TwoWheel();
		Obj1.noOfWheels();
		Obj1.noOfEngine();
		
		Bike bike =new Bike();
		bike.brandName();
		bike.noOfEngine();
		bike.noOfWheels();
		
		

	}

}
