package Assignment7Actual;
@FunctionalInterface
interface StringProcessor{
	int processor(String input) ;
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringProcessor lengthProcessor = (String s)->s.length();
		String testString = "Hello , Functional Interface";
		int length = lengthProcessor.processor(testString);
		System.out.println("The length of a string is :"+length);

	}

}
//Output
//The length of a string is :28

