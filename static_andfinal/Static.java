package static_andfinal;

public class Static {
	static {
		System.out.println("static");
		
	}
	static int square(int s) {
		return s*s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int re = square(5);
		System.out.println(re);

	}

}
