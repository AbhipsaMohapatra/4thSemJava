package Assignment7Actual;
import java.util.function.Function;

public class Q5 {
	public static Function<Integer,Integer> getSqauredFunction(){
		 return (Integer x)->x*x;
		
//		return (Integer  x)  - > x * x ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> squareFunction = getSqauredFunction();
		int[]numbers = {2,3,4,5,6};
		System.out.println("Square of numbers");
		for(int num:numbers) {
			System.out.println("Square of "+num+" is "+ squareFunction.apply(num));
		}

	}

}
