package PackageMaven;

import java.awt.geom.Point2D;

public class Q2 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2  t1 = new Q2();
		Q2 t2 = new Q2();
		t1.start();
		t2.start();

	}

}
