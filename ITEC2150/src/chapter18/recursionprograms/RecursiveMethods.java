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
		else
		reverse[length-1] = forward[forward.length - length];
		return reverseArray(forward,reverse,length-1);
	}
	
	public int[] reverseArrayHelper() {
	
		int[]a= reverseArray( computeArray, new int[computeArray.length], computeArray.length);
		System.out.println(Arrays.toString(a));
		return a;
		
		
	}
	
	public double goldenRatio(int n){
		if(n==0)
			return 1;
		else if(n>0)
			return 1+1/goldenRatio(n-1);
		else return -1;
	}
	
	public double goldenRatioHelper(){
		 System.out.println(goldenRatio(n));
		 return goldenRatio(n);
		 
	}
	
	public int decimalToBinary(int d){
		if(d==0){
			
			return 0;
		}
		else decimalToBinary(d/2);
		System.out.print(d%2);
		return d;
		
	}
	public int decimalToBinaryHelper(){
		System.out.println(n);
		return decimalToBinary(n);	
	}
	public boolean isSorted(int[] a, int l) {
		
		if(a[l] > a[l-1])
			return true;
		else //(a[l-2] > a[l-1])
			return false;
			
		
	}
	public boolean isSortedHelper() {
		System.out.println(Arrays.toString(computeArray));
		 isSorted(computeArray,computeArray.length);
		 System.out.println(isSorted(computeArray,computeArray.length));
		isSorted(computeArray,computeArray.length);
		 return isSortedHelper();
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
