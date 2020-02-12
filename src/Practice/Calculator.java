package Practice;

import java.util.Scanner;

public class Calculator {
	static int num1;
	static float num2;
	String operator;
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Enter your first number");
		obj.num1 = calc.nextInt();
		
		System.out.println("Enter your second number");
		obj.num2 = calc.nextFloat();
		
		System.out.println("Enter an operation");
		obj.operator = calc.next();
		
		if (obj.operator.equals("*")) {
			multiplication();
			}
		else if (obj.operator.equals("/")) {
			division();
			
		}
	}
	
	
	public static void multiplication()  {
		Calculator obj = new Calculator();
		System.out.println("The result is: " + (obj.num1 * obj.num2));
		
	}
	
	public static void division()  {
		Calculator obj = new Calculator();
		System.out.println("The result is: " + (obj.num1/obj.num2));
		
	}
	
	public static void addition()  {
		Calculator obj = new Calculator();
		System.out.println("The result is: " + (obj.num1+obj.num2));
		
	}
	
	public static void subtraction()  {
		Calculator obj = new Calculator();
		System.out.println("The result is: " + (obj.num1-obj.num2));
		
	}
}
