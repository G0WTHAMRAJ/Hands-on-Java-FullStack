package com.day5;

public class CloneClass implements Cloneable {
	int id;
	String name;
	float salary;
	
	CloneClass(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("ID is  : " +id);
		System.out.println("Name is  : " +name);
		System.out.println("Salary is  : " +salary);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneClass obj1=new CloneClass(101,"Gowtham",7000.0f);
		obj1.display();
		CloneClass obj2= (CloneClass) obj1.clone();
		obj2.display();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		

	}

}
