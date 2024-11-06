package com.day5;
//Implementing Runnable interface for Thread which as only one abstract method which is run 
public class ThreadClass3  implements Runnable {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			if(Thread.currentThread().getName()=="T1") {
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName()+" is Running ");
			}
			if(Thread.currentThread().getName()=="T2") {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName()+" is Running ");
			}
			

			
		}
	}
	

	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadClass3()); //creating thread using runnable interface 
		t1.setName("T1");
		t1.start();
		Thread t2=new Thread(new ThreadClass3());
		t2.setName("T2");
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("Main End");
	}

}
