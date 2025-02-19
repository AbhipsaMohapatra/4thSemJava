package Assignment2.Q8;

public class SavingsAccount extends Account{



    double intrestRate;
    SavingsAccount(int acno,double bal,double intrestRate){
        super(acno,bal);
        this.intrestRate = intrestRate;
    }

    public void deposit(double amt){
        double bal = getBalance();
        double i = (amt*intrestRate)/100;
        setBalance(bal+i+amt);
        System.out.println("Intrest amount deposited"+(i+amt));


    }
    public void withdrawal(double amt){
        double bal = getBalance();
        if(bal<amt){
            System.out.println("Withdrawl Not Possible insufficient balance");
        }
        else{
            setBalance(bal-amt);
            System.out.println("Amount remaining after withdrawl "+(bal-amt));
        }


    }


}
