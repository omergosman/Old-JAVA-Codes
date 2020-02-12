package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_External_File {

	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\Users\\x\\eclipse-workspace\\Class Two\\src\\Practice\\omer.properties";
		Properties externalfile = new Properties();
		FileInputStream er = new FileInputStream(filepath);
		
		externalfile.load(er);
		
		String Family = externalfile.getProperty("dad");
		
		System.out.println("This family member is: " + Family);
	}

}
