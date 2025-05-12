package PackageMaven;

public class Q7 {
	synchronized void waitMethod() {
		System.out.println(Thread.currentThread().getName()+" is going to  wait");
		try {
			wait();
			
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	synchronized void notifyOnethread() {
		System.out.println("Notifying one thread");
		notify();
	}
	synchronized  void notifyAllthreads() {
		System.out.println("Notify all threads ");
		notifyAll();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Q7 shared= new Q7();
		Thread t1 = new Thread(shared::waitMethod,"Thread-1");
		Thread t2 = new Thread(shared::waitMethod,"Thread-2");
		t1.start();
		t2.start();
		Thread.sleep(1000);
		shared.notifyAllthreads();
		

	}

}
