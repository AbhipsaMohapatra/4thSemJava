package Assignment2.Q7;

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("One Day","XYZ",345);
        Magazine m = new Magazine("The Theme","CFR","23rd October 2024");
        DVD d = new DVD("Hello","Sir Vincent",12.34);
        System.out.println("BOOK");
        d.displayDetails();
        System.out.println("MAGAZINE");
        m.displayDetails();
        System.out.println("DVD");
        d.displayDetails();
    }
}
