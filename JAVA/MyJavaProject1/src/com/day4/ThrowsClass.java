package com.day4;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;



public class ThrowsClass {
	static void myMethod() throws FileNotFoundException,SQLException{
		FileReader fr =new FileReader("abc.txt");
	}

	public static void main(String[] args) {
	//	ThrowsClass.myMethod(); handle the throws Exception using the class 
		

	}

}
