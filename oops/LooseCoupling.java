package oops;
interface Topic{
	void understand();
}
class Topic1 implements Topic{
	public void understand() {
		System.out.println("Got it");
	}
}
class Topic2 implements Topic{
	public void understand() {
		System.out.println("Understand");
	}
}
public class LooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic topic = new Topic1();
		topic.understand();

	}

}
