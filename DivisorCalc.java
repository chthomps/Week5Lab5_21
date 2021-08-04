
//This program accepts two number inputs from the user and returns the greatest common divisor (gcd) using recursion

import java.util.Scanner;

public class DivisorCalc {
	
	private static int num1, num2;
	
	
	public DivisorCalc (int num1, int num2) { //Constructor: accepts two integer inputs from user
	}
	
	//main method
	public static void main(String[] args) {
		
		System.out.println("Enter two integers for which we can find the greatest common divisor (num1, num2) ");
		
		Scanner scan = new Scanner(System.in);
		
		num1= scan.nextInt();
		num2= scan.nextInt();
		
		System.out.println("The greatest common divisor of your two numbers is: " +DivisorCalc.gcd(num1, num2)); //class name.method
		
		//note how this is different from how we established Figure (new Figure) objects in Program2  By making gcd a static method, we can invoke 
		//using our class name (DivisorCalc) in the main method.
		
		scan.close();
		
	}
	
	//GCD static method for calculating greatest common divisor via recursion
	
	public static int gcd(int num1, int num2) {  //static methods allow for invocation via class name in main method
		if (num2 == 0)
			return num1;
		else
			return gcd(num2, num1%num2);  //base case of recursion.... resets num2 using the remainder and reapplies the gcd process 
	}

}
