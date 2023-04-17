package Linkedin.c2;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Asad",-99);
        System.out.println(b1.getOwner());
        System.out.println(b1.getBalance());
        b1.Deposit(10000);
        System.out.println(b1.getBalance());
        b1.Withdraw(5899);
        System.out.println(b1.getBalance());
    }


}
