package PackageMaven;

public class Q4 extends Thread {
	public void run() {
		System.out.println("Inside run() method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(7);
		System.out.println("Prioprity of the main thread is "+ Thread.currentThread().getPriority());
		Q4 th1 = new Q4();
		System.out.println("Priority of thread th1 is "+th1.getPriority());
	}

}
