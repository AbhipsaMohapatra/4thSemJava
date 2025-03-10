package ErrorHandling;
import java.io.FileReader;
import java.io.IOException;
class Parent{
	void msg() throws Exception{
		System.out.println("Parent method");
		
	}
}

public class overriding extends Parent {
	void msg() throws IOException{
		System.out.println("TestExceptionChild");
		FileReader fileReader = new FileReader("ex.txt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new overriding();
		try {
			p.msg();
		}
		catch(Exception e) {
			System.out.println("File not found "+e);
		}

	}

}
