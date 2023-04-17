package Linkedin.c2;

public class BankAccount {
    private final String owner;
    private double balance;

    BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = Math.max(balance,0);

    }
    public void Withdraw(double withdrawBal){
        this.balance = balance-withdrawBal;
    }
    public void Deposit(double depositBal){
        this.balance = balance+depositBal;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
