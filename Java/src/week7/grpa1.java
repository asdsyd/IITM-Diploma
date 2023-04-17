package week7;
import java.util.*;
//Define DivisionException class here
class DivisionException extends Exception{
    public String toString(){
        return "Division by 3 is not allowed";
    }
}


public class grpa1 {

    //Define divide(int a, int b) here
    public static int divide(int a, int b) throws DivisionException{
        int c=0;
        if (b==3){
            throw new DivisionException();
        }
        else {
            c = a/b;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //call divide method here
        try {
            System.out.println(divide(x,y));
        }
        catch (DivisionException e){
            System.out.println(e);
        }



    }
}
