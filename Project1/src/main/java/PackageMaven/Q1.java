package PackageMaven;

import java.security.PublicKey;
class thread_simple extends Thread{
	public void run() {
		System.out.println("My newthread is running");
	}
}


public class Q1 implements Runnable{
	public void run() {
		System.out.println("My thread is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 myRunnableInterface = new Q1();
		Thread  newThread = new Thread(myRunnableInterface);
		newThread.start();
		thread_simple t= new thread_simple();
		t.start();
		
		
		                                                                       

	}

}
