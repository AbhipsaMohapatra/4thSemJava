package Assignment8;



class Table{
	 void printTable() {
		int sum =0;
		for( int i=1;i<=100;i++) {
			sum = sum+i;
		}
		System.out.println("The sum is "+ sum);
		
	}
	 void Multiply(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(n*i);
		}
	
	}
	
	
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable();
	}
} 
class MyThread2 extends Thread{
	Table table ;
	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.table = t;
	}
	public void run() {
		table.Multiply(20);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		MyThread1 thread1 = new MyThread1(obj);
		MyThread2 thread2 = new MyThread2(obj);
		thread1.start();
		thread2.start();


	}

}
