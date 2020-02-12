package inheritance_Practice;

public class Child extends Parent { 
	
	static int x = 8;
	static int y = 10;
	
	public static void main(String[] args) {
		 			   	
		 Child newobj = new Child();
		 
		 multiplication(newobj.local(),y);                         //newobj.local()
		 Grand_parent.addition(x,y);
		    	
		  }
	
	
	public int local() {
		return super.x;              // returning x from Parent class
	}

}
		

			


	


