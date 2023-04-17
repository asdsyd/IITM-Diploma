package apr_oppe;
import java.util.*;
//DEFINE classes DataType1 and DataType2
class DataType1 implements Cloneable{
    ArrayList<Integer> arr;
    DataType1(ArrayList<Integer> aList){
        this.arr = new ArrayList<Integer> (aList);
    }
    @Override
    public DataType1 clone() throws CloneNotSupportedException{
        DataType1 clone = new DataType1(this.arr);
        return clone;
    }
}
class DataType2{
    int i;
    DataType1 t1;
    DataType2(int i,DataType1 s){
        this.i=i;
        this.t1= new DataType1(s.arr);
    }
    @Override
    public DataType2 clone() throws CloneNotSupportedException{
        DataType2 clone = new DataType2(this.i,this.t1);
        return clone;
    }
    @Override
    public String toString(){
        String ss=this.i +" : ";
        for(int i=0;i<this.t1.arr.size();i++){
            if(i==this.t1.arr.size()-1){
                ss += this.t1.arr.get(i);
            }
            else{
                ss += this.t1.arr.get(i)+" : ";
            }
        }
        return ss ;
    }
}

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(11);
        aList.add(12);
        DataType1 t1 = new DataType1(aList);
        DataType2 t2 = new DataType2(10,t1);
        try{
            DataType2 t2Clone = (DataType2)t2.clone();
            t2Clone.i = sc.nextInt();
            t2Clone.t1.arr.set(1,sc.nextInt());
            System.out.println(t2);
            System.out.println(t2Clone);
        }
        catch(CloneNotSupportedException cse){
            System.out.println(cse.getMessage());
        }
        sc.close();
    }
}
