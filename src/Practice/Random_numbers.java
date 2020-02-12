package Practice;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Random_numbers {
    // 01/11 Class video @ 00:50
	public static void main(String[] args) {
		//Generate 500 RANDOM numbers, and find the Nth smallest number range from (100 – 1000)
		
		for (int i = 1; i <= 500 ; i++) {
	       
	        int Random = (int)(Math.random()*100);
	        System.out.println(Random);
	       }
		
		//Set<Integer> myList = new TreeSet<Integer>(TreeSet.asSet(Random));
		
		//int nums[]=new int[Random];
		 

//		int array[] = new int [500];
//	        for (int a = 0; a < array.length; a++){
//	        	for (int i = 1; i <= 500 ; i++) {
//     	       
//	     	        int Random = (int)(Math.random()*100);
//     	        System.out.println(Random);
//	        	//array[a] = a;
//	            System.out.println(array[a]);
//	        }
//	}
	}

}