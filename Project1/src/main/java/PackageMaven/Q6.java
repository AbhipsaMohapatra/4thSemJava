package PackageMaven;

import java.security.PublicKey;

public class Q6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String firstResource = "First  Resource";
		final String secondResource = "Second resource ";
		Thread thread1  = new Thread("first thread") {
			public void run() {
				synchronized (firstResource) {
					System.out.println(this.getName()+" : First Resource is locked ");
					try {
						Thread.sleep(100);
						
					}
					catch(Exception e) {
						synchronized (secondResource) {
							System.out.println("Second resource is locked ");
						}
					}
					
				}
			}
		};
		Thread thread2 = new Thread("Second thread") {
			public void run() {
				synchronized (secondResource) {
					System.out.println(this.getName()+" : the second resource is locked ");
					try {
						Thread.sleep(100);
						
						
					}
					catch(Exception e) {
						
					}
					synchronized (firstResource) {
						System.out.println("First resource is locked");
						
					}
				
					
				}
			}
		};
		thread1.start();
		thread2.start();
		
		

	}

}
