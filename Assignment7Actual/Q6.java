package Assignment7Actual;
import java.util.function.Function;

import Iterator.iteratorExample;

public class Q6 {
	public static Function<Integer,Long>  getFactorialFunction(){
		return (Integer n) -> {
			long result = 1;
			for(int i=2;i<=n;i++) {
				result = result*i;
			}
			return result;
		};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Long> functionalFunction = getFactorialFunction();
		int[] numbers = {0,1,5,7,10};
		for(int num :numbers) {
			System.out.println("factorial of "+num+" is "+functionalFunction.apply(num));
		}
		
		

		
	}

}
