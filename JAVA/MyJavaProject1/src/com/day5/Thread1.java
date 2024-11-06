package com.day5;

public class Thread1  extends Thread {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("My Thread is Running ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	

	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Main End");
	}

}
