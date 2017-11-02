package generics.wildcard;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class TextFileEncryptDecrypt {
	private int key;
	
	public TextFileEncryptDecrypt(){
		Random rand = new Random(System.currentTimeMillis());
		key=rand.nextInt(100-5)+5;
	}
	public TextFileEncryptionDecryptionUtilities<?> readTextFile (File file) {
		TextFileEncryptionDecryptionUtilities<Integer> eDU = 
				new TextFileEncryptionDecryptionUtilities<>();
			BufferedInputStream fileIn;
		try {
			//Opens the file for reading using binary I/O
			fileIn = new BufferedInputStream(
					new FileInputStream(file));
			int a = 0;
			//Use a while loop to read integers and add them to the object until the
			//end-of-file is reached
			while((a= fileIn.read())>=0){
				eDU.addToEnd(a);
			}
			fileIn.close();
			return eDU;
		} catch (IOException e) {
			e.printStackTrace();
			return eDU;
		}
	}
	public TextFileEncryptionDecryptionUtilities<?>  writeTextFile void
	(File file) {
	
}
