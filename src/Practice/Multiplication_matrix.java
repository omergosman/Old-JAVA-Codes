package Practice;

import java.util.Scanner;

public class Multiplication_matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter n");
		
		int n = input.nextInt();
		
		for (int i=1; i<=n ; i++) {
		for (int m=1; m<=n ; m++) {
			
			System.out.print(m*i + "     ");
			//System.out.print("\t");
			}
		System.out.println();
		}
			
			
		
	}
	
}
