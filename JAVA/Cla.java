import java.util.Scanner;

public class Cla{ //command Line Argument
     public static void main (String args[]){
	if(args.length==2){
	int a =Integer.parseInt(args[0]);
	int b =Integer.parseInt(args[1]);
	int sum=a+b;
	System.out.println("Command Line Arugument: "+sum);
	}
	else{
	System.out.println("pass the value");
	}

	}
}