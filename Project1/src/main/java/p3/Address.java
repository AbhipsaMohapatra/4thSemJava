package p3;

public class Address {
	public int getHouseno() {
		return houseno;
	}


	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String cityString) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	private int houseno;
	private String city;
	private int pincode;
	 public void display() {
		 System.out.println(this.pincode+" "+this.houseno+" "+this.city);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
