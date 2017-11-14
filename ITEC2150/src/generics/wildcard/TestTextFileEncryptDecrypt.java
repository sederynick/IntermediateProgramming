package generics.wildcard;

import java.io.File;

public class TestTextFileEncryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TextFileEncryptDecrypt test = new TextFileEncryptDecrypt();
	String original = (System.getProperty("user.home")
				+ File.separatorChar + "Desktop" + File.separatorChar + "TestFolder"+ File.separatorChar +"org_text_file.txt");
	File fileOrg=new File(original);
	String encrypted =(System.getProperty("user.home")
			+ File.separatorChar + "Desktop" + File.separatorChar + "TestFolder"+ File.separatorChar +"enc_text_file.bin");
	File fileEncrypted = new File(encrypted);
	String decrypted =(System.getProperty("user.home")
			+ File.separatorChar + "Desktop" + File.separatorChar + "TestFolder"+ File.separatorChar +"dec_text_file.txt");
	File fileDecrypted = new File(decrypted);
	test.encryptTextFile(fileOrg, fileEncrypted);
	test.decryptTextFile(fileEncrypted, fileDecrypted);
	}

}
