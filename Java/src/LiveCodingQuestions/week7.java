package LiveCodingQuestions;

import java.util.*;
//define checked exception DiscountException
class DiscountException extends Exception{
    @Override
    public String getMessage() {
        return "Nondiscountable expense";
    }
}
// define class Customer
class Customer {
    private String name;
    double expense;
    final double discountrate=0.05;
    public Customer(String name, double expense) {
        this.name=name;
        this.expense=expense;
    }

    public String getName() {
        return name;
    }
    public void checkDiscount() throws DiscountException{
            double discount;
            if (this.expense >= 1000 ){
                discount=this.expense*discountrate;
                System.out.println(this.getName() +":"+discount);
            }
            else {
                throw new DiscountException();
            }
    }
}
public class week7{
    static void displayCustomers(LinkedList<Customer> cus)  {
        // iterate through cus and invoke checkDiscount() on each customer object
        for(Customer temp: cus){
            try {
                temp.checkDiscount();
            }
            catch (DiscountException de){
                System.out.println(temp.getName()+ ": " + de.getMessage());;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var cus = new LinkedList<Customer>();
        for(int i = 0; i < 4; i++){
            cus.add(new Customer(sc.next(),sc.nextDouble()));
        }
        displayCustomers(cus);
    }
}