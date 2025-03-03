package newAssignment2;
class Book{
	private int bookId;
	private String Name;
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bookId, String name, double price) {
		super();
		this.bookId = bookId;
		Name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", Name=" + Name + ", price=" + price + "]";
	}
	 public boolean equals(Object obj) {
		 if(this == obj) {
			 return true;
		 }
		 if(obj== null || getClass()!= obj.getClass()) {
			 return false;
		 }
		 Book book =(Book) obj;
		 return Double.compare(book.price, price) ==0;
	 }
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(101, "Book1", 24.67);
		Book book2 = new Book(101, "Book2", 24.67);
//		Book book3 = new Book(101, "Book3", 289.67);
		System.out.println("Details of book1 "+ book1);
		System.out.println("Details of book2 "+ book2);
		if(book1.equals(book2)) {
			System.out.println("Both books have the same price");
		}
		else {
			System.out.println("Both books have the different price");
			
		}

	}

}
