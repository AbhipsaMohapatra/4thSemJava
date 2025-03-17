package genericExtraQuestions;


public class Q2 {
	public  static <T> void  swap(T[]a,int n1,int n2) {
		
		T temp =  a[n1];
		a[n1]=a[n2];
		a[n2]=temp;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before swap");
		
		
		Integer[] arr = {1,2,3,4,5};
		for(int e:arr) {
			System.out.print(e+" ");
		}
		swap(arr, 0, 2);
		System.out.println();
		System.out.println("After swap");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		

	}

}
