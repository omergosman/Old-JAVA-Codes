package forLoops_Practice;

import java.util.Scanner;

public class Assignment3_3_2 {
	static float num1;
	static float num2;
	String operation;
	
	public static void main(String[] args) {
	
	Scanner calc = new Scanner(System.in);
	
	System.out.println("Enter your first number");
	 num1 = calc.nextFloat();
	
	System.out.println("Enter a second number");
	 num2 = calc.nextFloat();
	
	System.out.println("Enter an operator (+, -, *, /)");
	String operation = calc.next();
	
	
		if  (operation.equals("+"))	{
				addition();
			} 
	
	else if (operation.equals("-")) {
				subtraction();
				}
	
	else if (operation.equals("*")) {
				multiplication();
				}
	
	else if (operation.equals("/")) {
				division();
				}
	}
public  static void addition() {
	
	System.out.println("The result is: " + (num1 + num2));
		
	}

public static void subtraction() {
		
	System.out.println("The result is: " + (num1 - num2));
}

public static void multiplication() {
		
	System.out.println("The result is: " + (num1 * num2));
}

public static void division() {
		
	System.out.println("The result is: " + (num1 / num2));
}
}