package forLoops_Practice;
import java.util.Scanner;

public class Assignment3_4 {

	public static void main(String[] args) {

		//Ask for a name and print if the string is Palindrome
		
		Scanner Pal = new Scanner(System.in);

		System.out.println("Please enter a name");
		
		String Name = Pal.nextLine();
		
		String Reversed_name= "";
				
		int len= Name.length();      // to get the length of the string "Name"
		
		for (int i=len-1; i>=0; i--) {
				
		Reversed_name= Reversed_name + Name.charAt(i);
		}
		System.out.println(Reversed_name);          // TO TEST THE INVERSE RESULT
		
		if (Name.equals(Reversed_name))  
		       System.out.println("The string is Palindrom.");  
		else  
		      System.out.println("Sorry, this is not Palindrome.");   	

		
		}
}
	