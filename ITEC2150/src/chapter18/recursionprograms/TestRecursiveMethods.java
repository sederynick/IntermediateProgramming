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
	System.out.println();
	System.out.println("Fibonnaci");
	recursiveMethods.fibonacciHelper();
	System.out.println();
	System.out.println("Match Parenthesis");
	recursiveMethods.matchParenthesisHelper("");
	recursiveMethods.matchParenthesisHelper("(");
	recursiveMethods.matchParenthesisHelper(")");
	recursiveMethods.matchParenthesisHelper("()");
	recursiveMethods.matchParenthesisHelper("(DWD)WD(DW)WD()");
	recursiveMethods.matchParenthesisHelper("(DWD)WD(DW)WD(" );
	recursiveMethods.matchParenthesisHelper("(DWD)WDDW)WD()");
	recursiveMethods.matchParenthesisHelper("(((3+8)))" );
	recursiveMethods.matchParenthesisHelper("(((3+8))" );
	recursiveMethods.matchParenthesisHelper("((3+8)))" );
	recursiveMethods.matchParenthesisHelper("((5-3)*((3+8)/9))" );
	recursiveMethods.matchParenthesisHelper("((5-3)*(3+8)/9))" );
	recursiveMethods.matchParenthesisHelper("((5-3)*((3+8))/9))");
	recursiveMethods.matchParenthesisHelper("((5-3)*)(3+8))/9))" );
	
	}

}
