package Assignment8;
class RowMultiplier extends Thread{
	 private int[][] A;
	    private int[][] B;
	    private int[][] result;
	    private int row;

	    public RowMultiplier(int[][] A, int[][] B, int[][] result, int row) {
	        this.A = A;
	        this.B = B;
	        this.result = result;
	        this.row = row;
	    }

	    public void run() {
	        int colsB = B[0].length;
	        int commonDim = B.length; 

	        for (int j = 0; j < colsB; j++) {
	            result[row][j] = 0;
	            for (int k = 0; k < commonDim; k++) {
	                result[row][j] += A[row][k] * B[k][j];
	            }
	        }
	    }
	
}
public class Q4 extends Thread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] A = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] B = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };

		        int rowsA = A.length;
		        int colsA = A[0].length;
		        int colsB = B[0].length;

		      
		        if (colsA != B.length) {
		            System.out.println("Matrix multiplication not possible: A's columns != B's rows");
		            return;
		        }

		        int[][] result = new int[rowsA][colsB];

		       
		        Thread[] threads = new Thread[rowsA];
		        for (int i = 0; i < rowsA; i++) {
		            threads[i] = new RowMultiplier(A, B, result, i);
		            threads[i].start();
		        }

		    
		        for (int i = 0; i < rowsA; i++) {
		            try {
		                threads[i].join();
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }

		 
		        System.out.println("Resultant Matrix:");
		        for (int[] row : result) {
		            for (int val : row) {
		                System.out.print(val + "\t");
		            }
		            System.out.println();
		        }
		    

	}
	

}
