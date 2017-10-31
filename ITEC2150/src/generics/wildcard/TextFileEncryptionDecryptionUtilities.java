package generics.wildcard;

import java.util.ArrayList;
public class TextFileEncryptionDecryptionUtilities<E> {
	private ArrayList<E> list;
	public TextFileEncryptionDecryptionUtilities() {
		list = new ArrayList<>();
	}
	public TextFileEncryptionDecryptionUtilities(int capacity) {
		this.list = new ArrayList<>(capacity);
	}
	public ArrayList<E> getList() {
		return list;
	}
	public void setList(ArrayList<E> list) {
		this.list = list;
	}
	public int getSizeOfList(){
		return list.size();
	}
	public boolean isListEmpty(){
		return list.isEmpty();
	}
	@Override
	public String toString() {
		return "EncryptionDecryptionUtilities [list=" + list + "]";
	}
	public void addElementToList(E o) {
		list.add(getSizeOfList()/2, o);
	}
	public E removeElementFromList() {
		if(!isListEmpty())
			return list.remove((getSizeOfList()-1)/2);
		else 
			return null;
	}	
	//Adds element to the end of the list
	public void addToEnd(E o) {
		list.add(o);
	}
	//If list is not empty, removes element at the beginning of the list
	public E removeFirst() {
		if(!isListEmpty())
			return list.remove(0);
		else 
			return null;
	}
	//If list is not empty, removes element at the end of the list
	public E removeLast() {
		if(!isListEmpty())
			return list.remove(getSizeOfList()-1);
		else 
			return null;
	}
}