package forLoops_Practice;

import java.util.Scanner;

public class Assignment3_1 {

	public static void main(String[] args) {

		//Given N --- Print this pattern up to N: 1, 4, 8, 12, 16
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter N value");
		
		int N = input.nextInt();
		
		System.out.print("1" );
		
		for (int x=1; x<=N; x=x+1) {
		
						
			int product = x*4;
		
			if  (product > N) 
		  
			 {
			  break;
			}
			System.out.print(", " + product);
	}
	}
	
	
	
	
}