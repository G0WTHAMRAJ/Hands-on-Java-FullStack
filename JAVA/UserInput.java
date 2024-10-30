import java.util.Scanner;

public class UserInput{
public static void main (String args[]){
	int a,b,sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Two numbers: ");
	a=sc.nextInt();
	b=sc.nextInt();

	sum=a+b;
	System.out.println("Addition :"+sum);
	}
}