package chapter18.recursionprograms;

public class TestRecursiveMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMethods recursiveMethods = new RecursiveMethods();
	System.out.println("Default Values: ");
	System.out.println(recursiveMethods);
	System.out.println("Reversed Array");
	recursiveMethods.reverseArrayHelper();
	System.out.println("Golden Ratio");
	recursiveMethods.goldenRatioHelper();
	System.out.println("Decimal to Binary");
	recursiveMethods.decimalToBinaryHelper();
	System.out.println();
	System.out.println("isSorted");
	recursiveMethods.isSortedHelper();
	
	}

}
