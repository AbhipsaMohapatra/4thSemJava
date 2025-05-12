package PackageMaven;

public class Q5 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5 runnable = new Q5();
		ThreadGroup myThreadGroup = new ThreadGroup("Threads");
		Thread t1 = new Thread(myThreadGroup,runnable,"My first thread");
		t1.start();
		Thread t2 = new Thread(myThreadGroup,runnable,"My Second Thread");
		t2.start();
		Thread t3 = new Thread(myThreadGroup,runnable,"My third thread");
		t3.start();
		System.out.println("Group "+myThreadGroup.getName());
		myThreadGroup.list();

		
	}

}
