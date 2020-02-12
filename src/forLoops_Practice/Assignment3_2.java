package forLoops_Practice;

import java.util.Scanner;

public class Assignment3_2 {

	public static void main(String[] args) {

		//Given N --- Print backward to 0
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter N value");
		
		int N = input.nextInt();
		
		System.out.print(N + " ");
		
		for (int i=N; i>0; i--) {
		
		System.out.print((i-1) + " ");
	}
	}
	
	
	
	
}