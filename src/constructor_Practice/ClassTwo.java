package constructor_Practice;

public class ClassTwo {

	
public ClassTwo(String Name) {
		
		this("Eyad",120000, "Sr. Automation Eng.");
		System.out.println("This is the end of the assignment");
}

public ClassTwo(String Name, int salary) {
		this("Eyad");
	
	
		}

public ClassTwo(String Name, int salary, String Position) {
		System.out.println("Employee Name:" + Name);
		System.out.println("Employee Salary:" + salary);
		System.out.println("Employee Position:" + Position);
	
}
}
