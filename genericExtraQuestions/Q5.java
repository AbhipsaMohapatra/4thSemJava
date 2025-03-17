package genericExtraQuestions;

public class Q5 {
	public static <T> int countOccurances(T[]a,T e) {
		int count=0;
		for(T ele:a) {
			if(ele==e) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Integer[]a= {23,56,78,90,78};
		System.out.println(countOccurances(a, 78));
		
	}

}
