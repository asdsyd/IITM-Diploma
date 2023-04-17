//package week6;
//import java.util.*;
//abstract class Account implements Comparable<Account>{
//    String acc_no;
//    double balance;
//    public Account(String no,double bal){
//        acc_no = no;
//        balance = bal;
//    }
////Override "compareTo" method here
//
//// Override "equals" method here
//
//// Override "hashCode" method here
//}
//class SavingsAccount extends Account{
//    public SavingsAccount(String acc_no, double bal) {
//        // Complete the definition
//    }
//    // Override the toString() method
//}
//
//
//class CurrentAccount extends Account{
//    double overdraft_limit;
//    public CurrentAccount(String acc_no, double bal, double odl) {
//        // Complete the constructor definition}}
//    }
//
//    // Override the toString() method}}
//}
//
//public class ppa2 {
//    // Define the `accountProcessor' method here
//
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        ArrayList<Account> acc = new ArrayList<Account>();
//
//        //reading the number of savings accounts
//        int s_acc_count = s.nextInt();
//        for(int i=1;i<=s_acc_count;i++) {
//            //reading acc no
//            String no = s.next();
//            //reading balance
//            double bal = s.nextDouble();
//            acc.add(new SavingsAccount(no,bal));
//        }
//
//        //reading the number of current accounts
//        int c_acc_count = s.nextInt();
//        for(int i=1;i<=c_acc_count;i++) {
//            //reading acc no
//            String no = s.next();
//            //reading balance
//            double bal = s.nextDouble();
//            //reading overdraft limit
//            double lim = s.nextDouble();
//            acc.add(new CurrentAccount(no,bal,lim));
//        }
//
//        accountProcessor(acc);
//    }
//}
