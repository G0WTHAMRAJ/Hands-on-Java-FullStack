package com.day5;


class TwoTable extends Thread{
	
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(i+" * 2 = "+(i*2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
			}
		}
	}
	
}


class FiveTable implements Runnable{
	
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.err.println(i+" * 5 = "+(i*5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
			}
		}
	}
	
}



public class ThreadInDiffClass  {

	public static void main(String[] args) {
		TwoTable two =new TwoTable();
		two.start();
		
		Thread five=new Thread(new FiveTable());
		five.start();
		

	}

}
