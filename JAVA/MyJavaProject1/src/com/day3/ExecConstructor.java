package com.day3;


class  FourWheeler{
	FourWheeler(){
		this(10);
		System.out.println("FourWheeler");
	}
	FourWheeler(int a){
		System.out.println("FourWheeler + 1");
	}
}
class Car extends FourWheeler{
	Car(){
		System.out.println("Car");
	}
}

public class ExecConstructor {

	public static void main(String[] args) {
		Car car =new Car();
		

	}

}
