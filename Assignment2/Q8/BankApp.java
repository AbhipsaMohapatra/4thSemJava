package Assignment2.Q8;

public class BankApp {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1234, 5000, 5);
        Account current = new CurrentAccount(2345, 2000, 1000);

        // Performing transactions
        savings.deposit(1000);
        savings.withdrawal(2000);


        current.deposit(1500);
        current.withdrawal(3500);

    }
}
