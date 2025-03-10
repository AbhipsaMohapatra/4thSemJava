package ErrorHandling_Application;

import java.awt.im.InputMethodHighlight;

public class checkApp {
	public void initiate() {
		Application app = new Application();
		try {
			app.input();
			app.verify();
			
		}
		catch(Exception a) {
			try {
				app.input();
				app.verify();
			}
			catch (Exception b) {
				try {
					app.input();
					app.verify();
				}
				catch(Exception c) {
					System.out.println("Card Blocked");
					System.exit(0);
				}
			}
		}
	}

}
