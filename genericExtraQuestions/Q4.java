package genericExtraQuestions;
class Pair<T,K>{
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public K getValue() {
		return value;
	}
	public void setValue(K value) {
		this.value = value;
	}
	T key;
	K value;
	Pair(T k,K v){
		this.key=k;
		this.value=v;
	}
	public void setKV(T k,K v) {
		this.key=k;
		this.value=v;
		
	}
	public void getKV() {
		System.out.println("The key is "+key+" the value is "+value);
	}
	
}

public class Q4 {
	public static void main(String[] args) {
		Pair<Character,Integer> p1 = new Pair<>('A',1);
		p1.getKV();
		p1.setKV('E', 34);
		p1.getKV();
	}

}
