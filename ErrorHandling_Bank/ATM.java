package ErrorHandling_Bank;
import java.util.*;

public class ATM {
	int acc = 999;
	int acc_no;
	int password = 888;
	int pw;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		this.acc_no = sc.nextInt();
		System.out.println("Enter password");
		this.pw = sc.nextInt();
	}
	public void verify()throws Exception{
		if(acc==acc_no && password==pw) {
			System.out.println("Collect your money");
		}
		else {
			InvalidCustomerException icException = new InvalidCustomerException();
			System.out.println(icException.message());
			throw icException;
		}
	}

	
}
