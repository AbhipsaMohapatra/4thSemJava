package Assignment2.Q8;

public class CurrentAccount extends Account{

    double overdraftLimit;
    CurrentAccount(int acno,double balance,double odl){
        super(acno,balance);
        this.overdraftLimit = odl;
    }

    public void deposit(double amt){
        double bal = getBalance() + amt;
        setBalance(bal);
        System.out.println("The deposit was "+bal);

    }
    public void withdrawal(double amt){
        double bal = getBalance()+overdraftLimit;

        if(bal>=amt){
            double rem = bal-amt;
            setBalance(rem);
            System.out.println("Your remaining amoutn is "+rem);
        }
        else{
            System.out.println("Insuffcient");
        }
    }

}
