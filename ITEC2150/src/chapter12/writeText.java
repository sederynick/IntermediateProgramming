package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class writeText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filePath = new File(System.getProperty("user.home") + File.separatorChar + "Desktop" + File.separatorChar + "TextIO" 
				+ File.separatorChar + "class-Status.txt");
		
		System.out.println(filePath);
		
		PrintWriter fileOut = null;
		
		try {
			fileOut = new PrintWriter(filePath);
			fileOut.println("John T Smith, Freshman");
			fileOut.println("Eric K Jones, Junior");
			fileOut.println("Jane S Miller, Senior");
			
			System.out.println("Wrote to file " + filePath.getName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Handling FileNotFoundException.");
			System.err.println(e.getMessage());
		}
		finally {
			fileOut.close();
		}

	}

}
