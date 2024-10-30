package com.day2;

//Java Bean Encapsulation 
class Mobile{
	private String brandName;
	private int price;
	
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Mobile(String brandName,int price){
		this.brandName=brandName;
		this.price=price;
	}
	
	void display() {
		System.out.println("name of the mobile : "+brandName);
		System.out.println("cost of the mobile : "+price);
		
	}
}

public class OopsClass {

	public static void main(String[] args) {
		
		Mobile samsung=new Mobile("Samsung",70000);
		samsung.display();
		samsung.setPrice(90000);
		samsung.display();

	}

}
