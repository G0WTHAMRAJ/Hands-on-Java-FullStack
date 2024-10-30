import java.util.Scanner;

public class UserInput1{
public static void main (String args[]){
	int id;
	String name ="Raj";
	float salary;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter id: ");
	id=sc.nextInt();
	System.out.println("Enter salary: ");
	salary=sc.nextFloat();
  	
  	

	
	System.out.println("ID is :"+id);
	System.out.println("Name is :"+name);
	System.out.println("salary is :"+salary);
	}
}