package com.day1;

class Employee{
	int eid;
	String name ;
	float salary;
	
	//Constructor to initialize the value
	Employee(int eid,String name,float salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + name);

		System.out.println("Employee salary : " + salary);

	}
}

public class MyClass3 {

	public static void main(String[] args) {
		
		//creating object Gowtham for class employee
		Employee gowtham=new Employee(101,"Gowtham",2000.0f);
		gowtham.display();
		
	}

}
