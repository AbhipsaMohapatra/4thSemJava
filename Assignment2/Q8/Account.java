package Assignment2.Q8;

abstract class Account {
    private int accountNumber;
    private double balance;
    Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    abstract void deposit(double amt);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void withdrawal(double amt);


}
