package chapter12.fileioutilities;

import java.io.FileNotFoundException;
import java.util.Scanner;

public final class TextFileUtilities extends FileUtilities {
	public static String FILE_EXTENSION = ".txt";

	public TextFileUtilities(String folderPathAndName, String fileName) {
		super(folderPathAndName, fileName);
		// TODO Auto-generated constructor stub
	}
	public void parseFile() {
		try {
		Scanner fileIn = new Scanner(filePath);
		int countLines = 0;
		int countWords = 0;
		int countCharacters = 0;
		String line = "";
		while(fileIn.hasNextLine()) {
			line = fileIn.nextLine();
			countLines++;
			String [] words = line.split(" ");
			countWords+=words.length;
			for(String word: words) {
				countCharacters+=word.length();
			}
		}
	}catch(FileNotFoundException e) {
			System.err.println("FileNotFoundException Handled.");
			e.printStackTrace();
		}
		
	}
}
