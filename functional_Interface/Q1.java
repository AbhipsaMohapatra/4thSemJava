package functional_Interface;

import Assignment6Actual.Q2;

public class Q1 {
	@FunctionalInterface
	interface printingSomeText{
		void print(String value);
		
	}
	public void printLambdaText(String lambdaText,printingSomeText pst) {
		pst.print(lambdaText);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 Imd1 = new Q1();
		String lambdaText = "Understanding lambdas";
		printingSomeText pst= (String letsPrint)->{System.out.println(letsPrint);};
		Imd1.printLambdaText(lambdaText,pst);
		

	}

}
