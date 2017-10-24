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
		
		if (l==1)
				return true;
		else if(a[l-1] < a[l-2])
			return false;
		else
			return isSorted(a,l-1);
		
	}
	public void isSortedHelper() {
		System.out.println(Arrays.toString(computeArray));
		 System.out.println(isSorted(computeArray,computeArray.length));
		Arrays.sort(computeArray);
		System.out.println(Arrays.toString(computeArray));
		 System.out.println(isSorted(computeArray,computeArray.length));
	}
	public int fibonacci(int n){
		if (n<=0)
			return 0;
		else if (n==1)
			return 1;
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public void fibonacciHelper(){
		System.out.println(n);
		 System.out.println(fibonacci(n));
	}
	public boolean matchParenthesis(String s, int countParenthesis){
		if(s.length()==0 && countParenthesis==0)
			return true;
		else if (s.length()==0 && countParenthesis!=0)
			return false;
		else if (s.charAt(0)=='(') {
			return matchParenthesis(s.substring(1),countParenthesis+1);
		}
		else if (s.charAt(0)==')' && countParenthesis!=0) {
			return matchParenthesis(s.substring(1),countParenthesis-1);
		}
		else if (s.charAt(0)==')' && countParenthesis==0)
			return false;
		else
			return matchParenthesis(s.substring(1),countParenthesis);
		}
	public void matchParenthesisHelper(String ss){
	
		System.out.println(matchParenthesis(ss, 0));
		
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
