package forLoops_Practice;

import java.util.Scanner;

public class Assignment3_5 {

	public static void main(String[] args) {
		
		//Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.

		Scanner Number_Input = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int number = Number_Input.nextInt();
		
		if (number%2==0)  
				       System.out.println("This is an EVEN number.");  
		else  
				      System.out.println("This is an ODD number.");   	
	}

}
