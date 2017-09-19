package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(System.getProperty("user.home")
				+ File.separatorChar + "Desktop" + File.separatorChar + "TextIO");
		
		System.out.println("The absolute path to folder " + file.getName() + ": " + file);
		
		if (file.exists()) {
			if (file.isDirectory())
				System.out.println("Folder " + file.getName() + " exists.");
			else 
				System.out.println("File " + file.getName() + " exists.");
		}
		else {
			if (file.mkdir())
				System.out.println("Created folder " + file.getName());
			else 
				System.out.println("Failed to create folder " + file.getName());
		}
		
		File filePath = new File(file.getAbsolutePath() + File.separatorChar + "test_file.txt");
				System.out.println(filePath);
				
				try {
					if (filePath.createNewFile()) {
						System.out.println("Created file " + filePath.getName());
					}
					else {
						System.out.println("Failed to create file " + filePath.getName());
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("IOException occurred.");
					e.printStackTrace();
				}
				
		//Display the file size in bytes
			System.out.println("The file size in byte: " + filePath.length());
				
				
		//Display the file's last modified date and time
			System.out.println("The file's last modified date and time: " + new Date(filePath.lastModified()));

		//Display if the program has read permission on the file or 
			if (filePath.canRead()) {
				System.out.println("The file " + filePath.getName() + " has read permission.");
			}
			else {
				System.out.println("The file " + filePath.getName() + " does not have read permission.");
			}
		
		//Display if the program has write permission on the file or
			if (filePath.canWrite()) {
				System.out.println("The file " + filePath.getName() + " has write permission.");
			}
			else {
				System.out.println("The file " + filePath.getName() + " does not have write permission.");
			}
			
//		if (filePath.setReadOnly()) {
//			System.out.println("File  " + filePath.getName() + " permission has been set to read only.");
//		}
//		else {
//			System.out.println("Failed to change file permission for  " + filePath.getName() + " to read only.");
//		}
		
//		if (filePath.setWritable(true)) {
//			System.out.println("File " + filePath.getName() + " permission has been set to write.");
//		}
//		else {
//			System.out.println("Failed to change file permission for " + filePath.getName() + " to write.");
//		}
		
	}

}
