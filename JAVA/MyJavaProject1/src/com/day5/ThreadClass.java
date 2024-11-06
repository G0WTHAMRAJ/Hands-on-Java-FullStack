package com.day5;

public class ThreadClass extends Thread {

	public static void main(String[] args) {
		
		Thread t =Thread.currentThread();
				System.out.println(t);
				System.out.println(t.getName());
				System.out.println(t.getPriority());
				
		ThreadClass t1 =new ThreadClass();
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.setPriority(8);
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
		System.out.println(t.getState());
		

	}

}
