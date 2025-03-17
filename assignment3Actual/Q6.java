package assignment3Actual;
import java.util.*;

public class Q6 {
	public static boolean Search(int[]a,int n) {
		for(int c:a) {
			if(c==n) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int[]arr = {2,45,3,1,452};
			Arrays.sort(arr);
			System.out.println("Your sorted array is ");
			for(int e:arr) {
				System.out.print(e+" ");
			}
			System.out.println("Enter the element you want to search");
			int n = sc.nextInt();
			System.out.println("Element present in array "+Search(arr, n));
			int ind = sc.nextInt();
			System.out.println("Element at index "+ ind +"is "+ arr[ind]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		

	}

}
