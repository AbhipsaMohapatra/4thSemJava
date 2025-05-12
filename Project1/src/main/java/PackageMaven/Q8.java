package PackageMaven;
class Table{
	synchronized void printTable(int n) {
		for( int i=1;i<=5;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(400);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
	
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
	
}

public class Q8 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		MyThread1 thread1 = new MyThread1(obj);
		MyThread2 thread2 = new MyThread2(obj);
		thread1.start();
		thread2.start();

	}

}
