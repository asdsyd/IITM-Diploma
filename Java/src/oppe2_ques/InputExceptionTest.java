package oppe2_ques;

import java.util.*;

//Question-3 of 4 from java oppe 2
//Define user defined exception: InvalidInputException
public class InputExceptionTest {
    //Define method convertCelsToKelv
    public static int convertCelsToKelv(int cels){
        return cels + 273;
    }
    //Define method convertKelvToCels
    public static int convertKelvToCels(int kels){
        return kels - 273;
    }

    public static void getMessage(){
        System.out.println("");
    }
    public static void main(String[] args) {
        int cels, kelv, cels_new, kel_new;
        Scanner sc = new Scanner(System.in);
        cels = sc.nextInt();
        kelv = sc.nextInt();

        try {
            kel_new = convertCelsToKelv(cels);
            cels_new = convertKelvToCels(kelv);

            System.out.println(kel_new);
            System.out.println(cels_new);
        } catch (InvalidInputException iie) {
            System.out.println(iie.getMessage());
        }
        sc.close();
    }
}
