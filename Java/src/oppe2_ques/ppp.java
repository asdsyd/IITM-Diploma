package oppe2_ques;

import java.util.*;
//Add your code for ComplexNum here
class ComplexNum <T extends Number> {
    //instance variable r and i
    T r;
    T i;
    //constructor to intialise r and i
    ComplexNum(T a, T b){
        this.r=a;
        this.i=b;
    }
//    T addNum
    public ComplexNum<Double> add(ComplexNum<?> c){
        double real = c.r.doubleValue() + this.r.doubleValue();
        double imag = c.i.doubleValue() + this.i.doubleValue();
        return new ComplexNum<Double>(real, imag);
    }

    //overide tostring
    @Override
    public String toString() {
        return this.r + " + " + this.i + "i";
    }

}
class ppp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}