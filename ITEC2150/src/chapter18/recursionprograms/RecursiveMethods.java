package chapter18.recursionprograms;

import java.util.Arrays;
import java.util.Random;

public class RecursiveMethods {

	private int[] computeArray;
	private int n;
	private int order;
	
	public RecursiveMethods() {
		computeArray = new int[10];
		Random randomNumber = new Random();
		for(int i = 0; i < computeArray.length; i++)
			computeArray[i] = randomNumber.nextInt(100);
		n = randomNumber.nextInt(10);
		order = randomNumber.nextInt(10);
	}
	public int[] reverseArray(int [] forward, int [] reverse, int length ) {
		if(length==0)
			return reverse;
		reverse[length-1] = forward[forward.length - length];
		return reverseArray(forward,reverse,length-1);
	}
	
	public int[] getComputeArray() {
		return computeArray;
	}
	public void setComputeArray(int[] computeArray) {
		this.computeArray = computeArray;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "RecursiveMethods [computeArray=" + Arrays.toString(computeArray) + ", n=" + n + ", order=" + order
				+ "]";
	}

	
}
