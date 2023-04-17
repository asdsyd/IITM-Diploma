package oppe2_ques;

import java.util.*;
class ArrayExample <T>{
    T[] a;
    ArrayExample(T a[]){
        this.a = (T[]) new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            this.a[i] = a[i];

        }
    }
    void display(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    int elementCount(T x){
        int count=0;
        for (int i = 0; i < this.a.length; i++) {
            if (x.equals(a[i])){
                count++;
            }
        }
        return count;
    }


// Define constructor(s) as needed
    // Define method display() that print the elements of array a
    // Define method elementCount(T x) that
    // counts the no. of times x is present in the array a
}
public class ppp2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); //Taking input for length of the array
        Integer[] x = new Integer[len];
        for(int i = 0; i < len; i++){
            x[i] = sc.nextInt(); //Taking input for Integer array
        }

        //Write the code here to create an object obj for Integer array
        ArrayExample<Integer> obj = new ArrayExample<>(x);

        int s1 = sc.nextInt(); //Taking input for the value to be counted
        String[] y = new String[len];
        for(int i = 0; i < len; i++){
            y[i] = sc.next(); //Taking input for String array
        }

        //Write the code here to create an object obj1 for String array
        ArrayExample<String> obj1 = new ArrayExample<>(y);
/////////////till here it ends
        String s2 = sc.next(); //Taking input for the value to be counted
        obj.display();
        System.out.println(obj.elementCount(s1));
        obj1.display();
        System.out.println(obj1.elementCount(s2));
    }
}