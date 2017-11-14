package chapter20;

import java.io.File;

public class CompareFileSize implements Comparable<CompareFileSize> {
	private File file;

//	Write the compareTo method that compares file sizes

//	The new LinkedList and PriorityQueue will be used to sort the CompareFileSizes in ascending order by File size
//	Below the above objects ask the user for 5 text file names and enter them into the ArrayList
//	Next, create 5 CompareFileSize objects using the file names in the ArrayList and add the file path. Add the objects to the linked list

	
	public CompareFileSize(File file) {
		super();
		this.file = file;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public int compareTo(CompareFileSize a) {
		// TODO Auto-generated method stub
		if (this.file.length() > a.file.length())
			return 1;
		else if (this.file.length() == a.file.length())
		return 0;
		else
		return -1;
	}
	
	

}
