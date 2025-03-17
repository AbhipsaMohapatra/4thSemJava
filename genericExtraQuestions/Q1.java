package genericExtraQuestions;
class Box<T>{
	public T getValT() {
		return valT;
	}
	public void setValT(T valT) {
		this.valT = valT;
	}
	T valT;
	Box(T data){
		this.valT = data;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Integer> b1 = new Box<Integer>(789);
		System.out.println("The value is "+b1.getValT());

	}

}
