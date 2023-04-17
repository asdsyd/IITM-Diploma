package apr_oppe;
import java.util.*;
//DEFINE a user-defined exception: InvalidInputException
class InvalidInputException extends Exception{
        InvalidInputException(String message){
            super(message);
        }
        public String toString(){
            return this.getMessage();
        }
        }
public class q3 {
    //DEFINE method convertCelsToKelv
    static int convertCelsToKelv(int cels) throws InvalidInputException{
        if(cels<-273){
            throw new InvalidInputException("Invalid Celsius Value");
        }
        int kelv=cels + 273;
        return kelv;

    }
    //DEFINE method convertKelvToCels
    static int convertKelvToCels(int kelv) throws InvalidInputException{
        if(kelv < 0 ){
            throw new InvalidInputException("Invalid Kelvin Value");
        }
        int cels=kelv-273;
        return cels;
    }
    public static void main(String[] args){
        int cels, kelv, cels_new, kelv_new;

        Scanner sc = new Scanner(System.in);
        cels = sc.nextInt();
        kelv = sc.nextInt();

        try{
            kelv_new = convertCelsToKelv(cels);
            cels_new = convertKelvToCels(kelv);

            System.out.println(kelv_new);
            System.out.println(cels_new);
        }
        catch(InvalidInputException ie){
            System.out.println(ie.getMessage());
        }
        sc.close();
    }
}
