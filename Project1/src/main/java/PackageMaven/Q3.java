package PackageMaven;

public class Q3  extends Thread {
	public void run() {
		for(int j=0;j<2;j++) {
			try {
				Thread.sleep(300);
				System.out.println("the current thread name is "+Thread.currentThread().getName());
			}
			catch(Exception e) {
				System.out.println("the exceptionn has been caught "+e);
			}
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3 th1 = new Q3();
		Q3 th2 = new Q3();
		Q3 th3 = new Q3();
		th1.start();
		try {
			System.out.println("The current thread name is: "+ Thread.currentThread().getName());
			th1.join();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("the exception has been caught "+e);
		}
		th2.start();
		try {
			System.out.println("The current thread name is: "+Thread.currentThread().getName());
			th2.join();
			
		}
		catch(Exception e) {
			System.out.println("The exception has been caught "+e);
		}
		th3.start();
		

	}

}
