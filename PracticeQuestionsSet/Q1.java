package PracticeQuestionsSet;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st = {"abc@gmail.com","cba@gmail.com","abc@gmail.com"};
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		list.add("abc@gmail.com");
		list.add("cba@gmail.com");
		list.add("abc@gmail.com");
		for(int i=0;i<3;i++) {
			String string = scanner.next();
			list.add(string);
		}
		
		
	   Set<String> set = new LinkedHashSet<String>();
	
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			if(set.contains(e.split("@")[0])) {
				
				iterator.remove();
			}
			else {
				set.add(e.split("@")[0]);
			}
		}
		
		System.out.println(list);
		

	}

}
