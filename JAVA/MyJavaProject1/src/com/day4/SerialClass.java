package com.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{ 
	transient int id; // cannot be transient
	String name ;
	float salary;
	
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee Name "+name);
		System.out.println("Employee id "+id);
		System.out.println("Employee Name "+salary);
	}
}
public class SerialClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp =new Employee(101,"Gowtham",70000.0f);
		
		//Serialization
		FileOutputStream fout =new FileOutputStream("C://Users//gowthamr//BIWW//Assignments//JAVA//NewObj.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fout);//converting the textfile into objectfile
		obj1.writeObject(emp);
		fout.close();
		obj1.close();
		System.out.println("Object is saved ");
	
		//De-Serialization
				FileInputStream fin =new FileInputStream("C://Users//gowthamr//BIWW//Assignments//JAVA//NewObj.txt");
				ObjectInputStream objin=new ObjectInputStream(fin);//converting the textfile into objectfile
				Employee temp =(Employee)objin.readObject();
				fin.close();
				objin.close();
				temp.display();
	}

}
