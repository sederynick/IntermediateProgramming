package generics.encryptdecrypt;

import java.util.ArrayList;

public class EncryptDecryptHelper <E> {
	private java.util.ArrayList<E> list;
	
	public EncryptDecryptHelper() {
		ArrayList<E> list = new ArrayList<E>();
	}
	
	public EncryptDecryptHelper(int capacity) {
		list = new ArrayList(capacity);
	}
	
	public int getSizeOfList() {
		return list.size();
	}
	
	public boolean isListEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "EncryptDecryptHelper [list=" + list + "]";
	}
	
	public void addElementTolist(E o) {
		//EncryptDecryptHelper e = new EncryptDecryptHelper();
		//e.addElementTolist(getSizeOfList()/2);
		list.add(getSizeOfList()/2, o);
	}
	
	public E removeElementFromList() {
		//EncryptDecryptHelper e = new EncryptDecryptHelper();
		//e.removeElementFromList((getSizeOfList()-1) /2);
		return list.remove((getSizeOfList()-1)/2);
	}
	

}
