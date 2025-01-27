package oops;
class Box{
	public int volume;
	Box(int l,int w,int h){
		this.volume = l*w*h;
	}

	}

public class Tight_coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(5, 5, 5);
		System.out.println(box.volume);
		

	}

}
