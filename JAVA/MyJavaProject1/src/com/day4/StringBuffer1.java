package com.day4;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("java"); 
		sb.append("home");//will use same memory to update 
		System.out.println(sb.reverse());
		

	}

}
