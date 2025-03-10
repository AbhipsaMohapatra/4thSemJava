package ErrorHandling;
import java.util.*;


public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("enter the value of a");
			int a = sc.nextInt();
			System.out.println("enter the value of b");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			System.out.println("enetr the array index");
			int ind = sc.nextInt();
			int[]arr = new int[ind];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]= sc.nextInt(); 
			}
			System.out.println("enter the index you want to access");
			int i = sc.nextInt();
			System.out.println("your value is "+arr[i]);
			String string =null;
			System.out.println(string.length());
		}
		catch (ArithmeticException e) {
			System.out.println("We cannot devide by zero");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Array index cannot be negative");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
		catch(NullPointerException e) {
			System.out.println("String cannot have null values");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
