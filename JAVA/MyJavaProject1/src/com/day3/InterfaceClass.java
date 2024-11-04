package com.day3;

interface VehiclePlan{
	void noOfEngine(); //Public and Abstract 
	void noOfWheel();
	void brandName();
}

abstract class Vehicle1 implements VehiclePlan{
	public void noOfEngine() { 
		System.out.println("I have one Engine");
	}
}
class Bike1 extends Vehicle1{
	public void noOfWheel() {
		System.out.println("I have 2 Wheels ");
	}
	public void brandName() {
		System.out.println("Brand name is Honda");
	}
}
public class InterfaceClass {

	public static void main(String[] args) {
		
		Bike1 obj1=new Bike1();
		obj1.noOfEngine();
		obj1.noOfWheel();
		obj1.brandName();
		
	}

}
