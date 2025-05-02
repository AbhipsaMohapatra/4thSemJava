package functional_Interface;

import java.util.*;
import java.util.function.Function;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = List.of(1,2,3,4,5);
		//example of high order function
		List<Integer> squaredNumbers = map(number,x->x*x);
		System.out.println("Squared numbers:  "+squaredNumbers);
		//Example of pure function :sum
		int sum = sum(number);
		System.out.println("Sum of numbers : "+sum);
		
		

	}
	public static <T,R> List<R> map(List<T> list,Function<T,R> mapper){
		List<R> result = new ArrayList<>();
		for(T item:list) {
			result.add(mapper.apply(item));
		}
		return result;
	}
	public static int sum(List<Integer> numbers) {
		int result =0;
		for(int e:numbers) {
			result=result+e;
		}
		return result;
	}

}
