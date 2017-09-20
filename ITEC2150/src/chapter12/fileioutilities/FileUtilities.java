package chapter12.fileioutilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUtilities {

	protected File folderPath;
	protected File filePath;
	protected Scanner input;
	
	public FileUtilities(String folderPathAndName, String fileName) {
		
		folderPath = new File(folderPathAndName);
		filePath = new File(folderPathAndName + File.separatorChar + fileName);
	}
	
	public final boolean makeFolder() {
		return folderPath.mkdir();
	}
	
	public final boolean createFile() {
		try {
			return filePath.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("IOException Handled.");
			e.printStackTrace();
		}
		System.out.println("Failed to create file.");
		return false;
		
	}
	public void readFile() {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(filePath);
			while(fileIn.hasNextLine()) {
				System.out.println(fileIn.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("FileNotFoundException Handled.");
			e.printStackTrace();
		}
		finally {
			fileIn.close();
		}
	}
	public void writeFile() {
		input = new Scanner(System.in);
		String line = "";
		PrintWriter fileOut = null;
		try {
			fileOut = new PrintWriter(filePath);
			while(!(line = input.nextLine()).equals("q")) {
				fileOut.println(line);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("FileNotFoundException Handled.");
			e.printStackTrace();
		}
		finally {
			fileOut.close();
		}
	}
}
