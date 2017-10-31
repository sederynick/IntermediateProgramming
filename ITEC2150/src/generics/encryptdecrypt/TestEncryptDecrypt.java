package generics.encryptdecrypt;

import java.util.Arrays;



public class TestEncryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncryptDecrypt encryptdecrypt = new EncryptDecrypt();
		System.out.println("Generics in Java");
		String encrypt= encryptdecrypt.encryptDecrypt("Generics in Java");
		System.out.println(encrypt);
		String decrypt= encryptdecrypt.encryptDecrypt(encrypt);
		System.out.println(decrypt);
		
		
		int[] intList = new int[] {26362,53723,93473};
		System.out.println(Arrays.toString(intList));
		int[] encrypt1=encryptdecrypt.encryptDecrypt(intList);
		System.out.println(Arrays.toString(encrypt1));
		int[] decrypt1=encryptdecrypt.encryptDecrypt(encrypt1);
		System.out.println(Arrays.toString(decrypt1));
	}

}
