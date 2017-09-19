package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filePath = new File(System.getProperty("user.home")
				+ File.separatorChar + "Desktop" + File.separatorChar + "TextIO"
				+ File.separatorChar + "class-status.txt");
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(filePath);
			if(fileIn.hasNext()) {
				System.out.println("Reading a word from the file.");
				System.out.println("The first word in file" + filePath.getName()
				 + ": " +fileIn.next());
			}
			else
				System.out.println("There is no content to read.");
			//read the rest of the first line
			if(fileIn.hasNextLine()) {
				System.out.println("\nReading the rest of the " + "first line");
				System.out.println("The rest of the first line: " + fileIn.nextLine());
			}
			else
				System.out.println("Reached end of file");
			//read rest of file
			if(fileIn.hasNextLine()) {
				System.out.println("\n Reading rest of file.");
				while(fileIn.hasNextLine())
					System.out.println(fileIn.nextLine());
			}
			else
				System.out.println("\nReached end of file");
				
		}
		catch (FileNotFoundException e) {
			System.err.println("FileNotFoundExceptionHandled");
			e.printStackTrace();
		}
		finally {
			fileIn.close();
		}
	}

}
