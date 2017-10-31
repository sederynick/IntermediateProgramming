package generics.encryptdecrypt;

import java.util.ArrayList;

public class EncryptDecryptHelper <E> {
	private java.util.ArrayList<E> list;
	
	public EncryptDecryptHelper() {
		 list = new ArrayList<E>();
	}
	
	public EncryptDecryptHelper(int capacity) {
		list = new ArrayList<E>(capacity);
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
	
		list.add(getSizeOfList()/2, o);
	}
	
	public E removeElementFromList() {
	
		return list.remove((getSizeOfList()-1)/2);
	}
	

}
