package com.day4;

//Java String
public class StringClass {

	public static void main(String[] args) {
		String s1="Java";
		String s2 = new String("java");
		char ch[]= {'a','b'};
		String s3 =new String(ch);
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.endsWith("va"));
		System.out.println(s1.replace('a','k' ));
		String s4="Hello World";
		System.out.println(s4.substring(2));
		System.out.println(s4.trim());
		String temp[] = s4.split(" ");
		for (String s:temp)
			System.out.println(s);
		
		char temp1[]=s4.toCharArray();
		for(char c:temp1)
			System.out.println(c);
			

	}

}
