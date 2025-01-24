package oops;
class Account {
	private int acc_no;
	private String name;
	private String email;
	private double amount;
	public void setacc(int acc_no) {
		this.acc_no = acc_no;
		
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void setamount(double amt) {
		this.amount = amt;
	}
	public int getacc() {
		return this.acc_no;
	}
	public String getname() {
		return this.name;
	}
	public String getemail() {
		return this.email;
	}
	public double getamount() {
		return this.amount;
	}
	
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setacc(6754356);
		a.setname("Abhipsa");
		a.setemail("abhipsa@gmail.com");
		a.setamount(98000000);
		System.out.println("The account number of "+a.getname()+" is "+a.getacc()+" the required email and balance is "+ a.getemail()+" "+a.getamount());

	}

}
