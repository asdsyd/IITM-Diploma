package week5;
import java.util.Scanner;
class ConvertArrays{
    public Double doubleArr[]=new Double[3];
    public Integer intArr[]=new Integer[3];
    public int x=0,y=0,z=0;
    public void convert(String[] arr){
//loop through the arr and store each element
        //in the appropriate array
        for(int i=0; i<arr.length; i++){
            try{
                int n = Integer.parseInt(arr[i]);
                intArr[y] = n;
                y++;

            }
            catch(NumberFormatException e){
                double d = Double.parseDouble(arr[i]);
                doubleArr[x] = d;
                x++;
            }
        }



    }
    public <T> void display(T[] arr){
        for(T elements:arr)
            System.out.print(elements+" ");
        System.out.println();
    }
}
public class ppa2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String arr[]= new String[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.next();
        }
        ConvertArrays conArrays=new ConvertArrays();
        conArrays.convert(arr);
        System.out.println("===After conversion Arrays===");
        conArrays.display(conArrays.doubleArr);
        conArrays.display(conArrays.intArr);
    }
}