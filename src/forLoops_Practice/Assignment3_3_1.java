package forLoops_Practice;

import java.util.Scanner;

public class Assignment3_3_1 {

	public static void main(String[] args) {
	
	Scanner calc = new Scanner(System.in);
	
	System.out.println("Enter your first number");
	int num1 = calc.nextInt();
	
	System.out.println("Enter a second number");
	int num2 = calc.nextInt();
	
	System.out.println("Enter an operator (+, -, *, /)");
	String operation = calc.next();
	
			if  (operation.equals("+"))	{
				System.out.println("The result is: " + (num1+num2));
			} 
	
	else if (operation.equals("-")) {
				System.out.println("The result is: " + (num1-num2));
				}
	
	else if (operation.equals("*")) {
				System.out.println("The result is: " + (num1*num2));
				}
	
	else if (operation.equals("/")) {
				System.out.println("The result is: " + (num1/num2));
				}
	}
}
