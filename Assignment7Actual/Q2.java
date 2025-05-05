package Assignment7Actual;

//import java.util.DoubleSummaryStatistics;

interface Calculator{
	public int getVal(int n1,int n2 );
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = (int n1,int n2)->{
			int sum = n1+n2;
			return sum;
			
			
		};
		System.out.println(c.getVal(1, 2));
		Calculator c2 = (int n1,int n2)->{
			int diff = n1-n2;
			return diff;
			
			
		};
		System.out.println(c2.getVal(2, 1));
		Calculator c3 = (int n1,int n2)->{
			int mul = n1*n2;
			return mul;
			
			
		};
		System.out.println(c3.getVal(12, 1));
		Calculator c4 = (int n1,int n2)->{
			int div = n1/n2;
			return div;
			
			
		};
		System.out.println(c4.getVal(12, 2));

	}

}
//Output
//3
//1
//12
//6
