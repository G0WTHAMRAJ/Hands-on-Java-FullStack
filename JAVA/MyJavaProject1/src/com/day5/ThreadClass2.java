package com.day5;

public class ThreadClass2  extends Thread {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" is Running ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	

	public static void main(String[] args) {
		ThreadClass2 t1 =new ThreadClass2();
		t1.setName("T1");
		t1.start();
		ThreadClass2 t2 =new ThreadClass2();
		t2.setName("T2");
		t2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Main End");
	}

}
