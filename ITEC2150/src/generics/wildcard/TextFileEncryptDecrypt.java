package generics.wildcard;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TextFileEncryptDecrypt {
	private int key;
	
	public TextFileEncryptDecrypt(){
		Random rand = new Random(System.currentTimeMillis());
		key=rand.nextInt(100-5)+5;
	}
	public TextFileEncryptionDecryptionUtilities<?> readTextFile (java.io.File file) {
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
	public void writeTextFile(TextFileEncryptionDecryptionUtilities<?> e,java.io.File file) {
		
		PrintWriter fileOut = null;
		try {
			fileOut =new PrintWriter(file);

			while(!(e).isListEmpty()) {
				fileOut.write((Integer) e.removeFirst());
			}
					
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.err.println("FileNotFoundException Handled");
			e1.printStackTrace();
		}
		finally {
			fileOut.close();
		}
		
	}
	public void encryptTextFile(java.io.File fileOrg, java.io.File fileEncrypted) {
//		•	Create an object of TextFileEncryptionDecryptionUtilities<E> of capacity 25 and pass the type Integer
//		•	Call the readTextFile method and store the returned reference of 
//		the TextFileEncryptionDecryptionUtilities<?> object
//		•	Use the removeFirst method to remove the integers one by one from the 
//		TextFileEncryptionDecryptionUtilities<?> object and X-OR them with the key and add 
//		them to the TextFileEncryptionDecryptionUtilities<E> object using the addElementToList method
//		•	Call the writeTextFile method and pass the TextFileEncryptionDecryptionUtilities<E> and java.io.File objects

		TextFileEncryptionDecryptionUtilities<Integer> eDU = 
				new TextFileEncryptionDecryptionUtilities<Integer>(25);
		TextFileEncryptionDecryptionUtilities<?> e = readTextFile(fileOrg);
		while(!(e).isListEmpty()) {
			eDU.addElementToList((int) e.removeFirst()^key);
			
		}
		writeTextFile(eDU,fileEncrypted);
	}
	public void decryptTextFile(java.io.File fileEncrypted, java.io.File fileDecrypted) {
		TextFileEncryptionDecryptionUtilities<Integer> decrypt1 = new TextFileEncryptionDecryptionUtilities<Integer>(25);
		TextFileEncryptionDecryptionUtilities<Integer> decrypt2 = new TextFileEncryptionDecryptionUtilities<Integer>(25);
		TextFileEncryptionDecryptionUtilities<?> decryption = readTextFile(fileEncrypted);

		while(!decryption.isListEmpty()) {
			decrypt1.addToEnd((Integer) decryption.removeFirst()^key);

		}
		while(!decrypt1.isListEmpty()) {
			decrypt2.addToEnd(decrypt1.removeElementFromList());
		}
		while(!decrypt2.isListEmpty()) {
			decrypt1.addToEnd(decrypt2.removeLast());
		}

		writeTextFile(decrypt1, fileDecrypted);
	}
}
