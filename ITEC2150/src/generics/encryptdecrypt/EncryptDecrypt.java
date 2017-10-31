package generics.encryptdecrypt;

import java.util.Arrays;

public class EncryptDecrypt extends EncryptDecryptHelper {
	private int key;
	
	public EncryptDecrypt() {
		key = (int) Math.random() * 100;
	}
	
	public String encryptDecrypt(String encrypt) {
		EncryptDecryptHelper<Character> edh = new EncryptDecryptHelper<Character>(25);
		for(int i = 1; i < encrypt.length(); i++) {
		char c = (char) (encrypt.charAt(i)^(char)key);
		edh.addElementTolist(c);
		}
		encrypt = "";
		while(isListEmpty()==false) {
			encrypt += removeElementFromList();
		}
		return encrypt;
		
	}
	
	public int [] encryptDecrypt(int [] encrypt) {
		EncryptDecryptHelper<Integer> edh = new EncryptDecryptHelper<Integer>(25);
		for(int i = 0; i < encrypt.length; i++) {
			int c =encrypt[i]^(int)Math.pow(2,key);
			edh.addElementTolist(c);
		}
		Arrays.toString(encrypt);
		while(!isListEmpty()) {
			removeElementFromList();
		}
		return encrypt;
	}

}
