package inheritance_Practice;

public class Parent {
      
  int z;
  int x = 5;
  int y = 7;
       
	static public void multiplication(int x, int y) {
		Parent obj = new Parent();  
		
		obj.z = x * y;

		System.out.println("This is from parent class, result is " + obj.z);
	    
   }
}
