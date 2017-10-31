package generics.encryptdecrypt;

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
		while(!isListEmpty()) {
			encrypt += removeElementFromList();
		}
		return encrypt;
		
	}
	
	public int [] encryptDecrypt(int [] encrypt) {
		EncryptDecryptHelper edh = new EncryptDecryptHelper(25);
		for(int i = 1; i < encrypt.length; i++) {
			int c =encrypt.length^(char)key;
			edh.addElementTolist(c);
		}
		
		while(!isListEmpty()) {
			encrypt +=removeElementFromList();
		}
		return encrypt;
	}

}
